/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula8_ex1;

import javax.swing.JOptionPane;

/**
 *
 * @author brunotto
 */
public class Pilha {
    
    public Object[] pilha;
    public int posicaoPilha;
    
    public Pilha(){
        this.posicaoPilha = -1;
        this.pilha = new Object [100];
    }
    
    //Verifica se a pilha está vazia
    public boolean pilhaVazia(){
        if(this.posicaoPilha == -1){
            return true;
        }else{
            return false;
        }
    }
    
    void esvazie_pilha(){
        this.posicaoPilha = -1;
    }
    
    int tamanho(){
        return(this.posicaoPilha+1);
    }
    
    void imprimir(int topo){
        for(int i=topo; i>0; i--){
            System.out.println("Valor da pilha: "+this.pilha[i]);
        }
    }
    
    //insere elementos na pilha
    int push(int topo, char num){
        this.posicaoPilha = topo;
        this.posicaoPilha++;
            if(this.posicaoPilha<0){
                this.posicaoPilha = 0;
            }else{
                if(this.posicaoPilha>100){
                    JOptionPane.showMessageDialog(null, "Erro 001: estouro de pilha.");
                    return(this.posicaoPilha--);
                }else{
                    this.pilha[this.posicaoPilha] = num;
                    System.out.println("Inserindo elemento: "+num);
                }
            }
        return(this.posicaoPilha);
    }
    
    //retira o elemento do topo da pilha
    int pop(int topo){
        this.posicaoPilha = topo;
        this.posicaoPilha--;
        
        if(this.posicaoPilha<-1){
            JOptionPane.showMessageDialog(null, "Erro 002: Pilha vazia");
            return(002);
        }else{
            System.out.println("Removendo o valor: "+this.pilha[this.posicaoPilha+1]);
            return(char) (this.pilha[this.posicaoPilha+1]);
        }
    }
    
    //Verifica o topo da pilha
    int top(int topo){
        this.posicaoPilha = topo;
        if(this.posicaoPilha < 0){
            JOptionPane.showMessageDialog(null, "Pilha Vazia. Erro 003");
            return(003);
        }else{
            return(char) (this.pilha[this.posicaoPilha]);
        }
    }
    
    
    
}
