/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
import java.util.Set;
import utfpr.dainf.if62c.pratica.*;

public class Main {
    public static void main(String[] args) {
        Time time1 = new Time();
        time1.addJogador("Goleiro", new Jogador(1, "Fulano"));
        time1.addJogador("Lateral", new Jogador(4, "Ciclano"));
        time1.addJogador("Atacante", new Jogador(10, "Beltrano"));

        Time time2 = new Time();
        time2.addJogador("Goleiro", new Jogador(1, "João"));
        time2.addJogador("Lateral", new Jogador(7, "José"));
        time2.addJogador("Atacante", new Jogador(15, "Mário"));

        Set<String> keys = (time1.getJogadores()).keySet();

        
        System.out.println("Posição    Time 1        Time 2");
        int tam = (time2.getJogadores()).size();

        for(String k: keys){
            Jogador j1 = (Jogador) (time1.getJogadores()).get(k);
            Jogador j2 = (Jogador) (time2.getJogadores()).get(k);
            System.out.printf("%-11s%2d - %-14s%2d - %s\n",k, j1.getNum(), j1, j2.getNum(), j2);
        }
    }
}
