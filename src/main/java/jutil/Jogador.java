/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Jogador to edit this template
 */
package jutil;

import java.util.ArrayList;

/**
 *
 * @author alexa
 */
public class Jogador {
   
    int vezes = 1;
    ArrayList perguntas1 = new ArrayList <>();
    ArrayList perguntas2 = new ArrayList <>();
    ArrayList perguntas3 = new ArrayList <>();
    ArrayList perguntas4 = new ArrayList <>();
    int pontuacao = 0;
    int selecionada =0;
    String nome;
    String ra;
    int idUsuario;
    
    public void SalvarNome(String i){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void SalvarRA(String i){
        this.ra = ra;
    }
    
    public String getRA(){
        return ra;
    }
    
    public void SalvarID( int i){
        this.idUsuario = idUsuario;
    }
    
    public int getID(){
        return idUsuario;
    }
    
    public void Addvezes(int i){
        this.vezes += 1 ;
    }
   
    public void SalvarSelecionada(int i){
        this.selecionada += 0;
    }
    
    public int getSelecionada(){
        return selecionada;
    }
    
    public int getVezes(){
        return vezes;
    }
    
    public void AddPerguntas1(int i ){
        this.perguntas1.add(i);
    }
        
    public void AddPerguntas2(int i ){
        this.perguntas2.add(i);
    }
    
    public void AddPerguntas3(int i ){
        this.perguntas3.add(i);
    }
    
    public void AddPerguntas4(int i ){
        this.perguntas4.add(i);
    }
    
    public ArrayList getPerguntas1(){
        return perguntas1;
    }
    
    public ArrayList getPerguntas2(){
        return perguntas2;
    }
    
    public ArrayList getPerguntas3(){
        return perguntas3;
    }
    
    public ArrayList getPerguntas4(){
        return perguntas4;
    }
    
    public void AddPontuacao(int i){
        this.pontuacao += i;
    }
    
    public int getPontuacao(){
        return pontuacao;
    }
   
}