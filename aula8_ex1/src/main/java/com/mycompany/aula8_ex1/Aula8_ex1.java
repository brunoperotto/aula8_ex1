/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula8_ex1;
import javax.swing.JOptionPane;

/**
 *
 * @author brunotto
 */
public class Aula8_ex1 {

    public static void main(String[] args) {
        String n;
        int topo = 0, num, i;
        int tamanhon;
        
        Pilha p1 = new Pilha();
        
        num = p1.tamanho();
        
        System.out.println("O tamanho da pilha é: "+num);
        System.out.println("------------------------------");
        
        System.out.println(p1.pilhaVazia());
        
        n = JOptionPane.showInputDialog("Insira o texto: ");
    
        System.out.println("Texto é: "+n);
        tamanhon = n.length();
        
        System.out.println("O comprimento da string é: "+tamanhon);
        
        for(i=0; i<tamanhon; i++){
            topo = p1.push(topo, n.charAt(i));
            p1.imprimir(topo);
        }
        
        System.out.println(p1.pilhaVazia());
        
    }
}
