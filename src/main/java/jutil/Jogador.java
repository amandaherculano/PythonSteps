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
    int pontuacao;
    int selecionada;
    int id;
    int admin;
    String nome;
    String ra;
    int idUsuario;
    
    
    
    public void SalvarNome(String nome){
        this.nome =  nome;
    }
    
    public String getNome(){
        return nome;
    }
        
    public void SalvarRA(String ra){
        this.ra = ra;
    }
    
    public String getRA(){
        return ra;
    }
    
    public void SalvarID( int idUsuario){
        this.idUsuario = idUsuario;
    }
    
    public int getID(){
        return idUsuario;
    }
    
    public void SalvarIsAdmin( int admin){
        this.admin = admin;
    }
    
    public int getIsAdmin(){
        return admin;
    }
    
    public void Addvezes(int i){
        this.vezes += 1 ;
    }
    
    public void LimparVezes(){
        this.vezes = 1;
    }
    
    public void LimparPontuacao(){
        this.pontuacao = 0;
    }
   
    public  void SalvarLinha(int selecionada){
       this.selecionada = selecionada;
    }
    
    public int getLinha(){
        return selecionada;
    }
    
    public void SalvarIdSelecionada(int id){
        this.id = id;
    }
    
    public int getIdSelecionada(){
        return id;
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