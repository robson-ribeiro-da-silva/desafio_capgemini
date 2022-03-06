/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetocapgemini.app;

import br.com.projetocapgemini.model.Mediana;

/**
 *
 * @author robso
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Mediana mediana = new Mediana(); //instancia um objeto da classe
        
        int arr[] = {9,2,1,4,6}; //inicializa a lista
        
        mediana.setLista(arr); //passa o array para a lista da classe
        System.out.print(" Imprimindo a Lista Inicial: ");
        mediana.imprime_lista(); //imprime a lista
        System.out.print("\n A Mediana é: "+ mediana.calcula_mediana() +"\n"); // calcula a mediana
        System.out.print(" Imprimindo a Lista Ordenada: ");
        mediana.imprime_lista();
        System.out.print("\n");
    }
    
}
