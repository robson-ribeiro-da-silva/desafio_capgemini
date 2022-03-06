/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetocapgemini.model;

/**
 *
 * @author robso
 */
public class Algoritmo {
    private int vetorN[];
    private int valorX;
    
    /*
     * Calcula a quantidade de elementos pares de uma lista e imprime os pares.
     */
    public int calcula_elementos_pares(){
       
        int x_contador = 0;
        int auxiliar = 0;
        System.out.println(" Calculando com a diferença de: "+valorX);
        
        for(int i = 0; i < vetorN.length; i++){
            for(int j = 0; j < vetorN.length; j++){
                if(vetorN[i] > vetorN[j]){
                    auxiliar = vetorN[i] - vetorN[j];
                }
                if(auxiliar == valorX){
                    x_contador++;
                    System.out.println("["+vetorN[i]+", "+vetorN[j]+"]");
                }
                auxiliar = 0;
            }
        } 
        return x_contador;
    }

    public int[] getVetorN() {
        return vetorN;
    }

    public void setVetorN(int[] vetorN) {
        this.vetorN = vetorN;
    }

    public int getValorX() {
        return valorX;
    }

    public void setValorX(int valorX) {
        this.valorX = valorX;
    }    
}
