/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.dainf.if62c.pratica;

import java.util.HashMap;

/**
 *
 * @author aron
 */
public class Time {
    private HashMap<String, Jogador> jogadores; 
    
    public Time(){
        jogadores = new HashMap<>();
    }
    public void addJogador(String escal, Jogador jog){
        jogadores.put(escal, jog);
    }
    
    public HashMap getJogadores(){
        return jogadores;
    } 
}
