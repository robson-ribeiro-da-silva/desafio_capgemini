/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetocapgemini.app;

import br.com.projetocapgemini.model.Algoritmo;

/**
 *
 * @author robso
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Algoritmo algoritmo = new Algoritmo(); //instancia um objeto da classe
        
        int n[] = {1,5,3,4,2}; //inicializa a lista
        
        algoritmo.setVetorN(n); //passa o array para a lista da classe
        algoritmo.setValorX(2); //informa o valor do intervalo a ser calculado a diferença
        
        int total = algoritmo.calcula_elementos_pares(); //calcula a quantidade de elementos pares
        System.out.println(" Total de Elementos Pares: "+ total); //imprime o total de elementos pares
    }
    
}
