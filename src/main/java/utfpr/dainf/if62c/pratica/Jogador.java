/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.dainf.if62c.pratica;

/**
 *
 * @author aron
 */
public class Jogador {
    Integer num; String nome;
    public Jogador(){}
    public Jogador(Integer num, String nome){
        this.num = num;
        this.nome = nome;
    }
    
    @Override
    public String toString(){
        return nome;
    }
    
    public String getNome(){
        return nome;
    }
    public Integer getNum(){
        return num;
    }
}
