/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetocapgemini.model;

import java.util.Arrays;

/**
 *
 * @author robso
 * Classe responsável por calcular a mediana
 */
public class Mediana {

    private int lista[];


    /*
     * Calcula a mediana de uma lista ordenada:
     * Inicialmente verifica se a lista é de tamanho PAR ou ÍMPAR
     * Se Ímpar: Retorna o elemento equivalente a metade da lista.
     * Se Par: Retorna a soma do elemento da metade da lista mais o posterior dividido por 2.
     */
    public int calcula_mediana() {
        
        this.ordena_lista();
        
        int verifica = lista.length % 2;
        if (verifica == 1) {
            return lista[((lista.length + 1) / 2) - 1];
        } else {
            int meio = lista.length / 2;
            return (lista[meio - 1] + lista[meio]) / 2;
        }
    }
    
    /*
     * Ordena a lista usando a biblioteca sort.
     */
    public void ordena_lista() {
        Arrays.sort(lista);
    }
    
    /*
     * Imprime a lista no console.
     */
    public void imprime_lista() {
        for (int contador = 0; contador < lista.length; contador++)
        System.out.print(lista[contador] + " ");
    }
    
    public int[] getLista() {
        return lista;
    }

    public void setLista(int[] lista) {
        this.lista = lista;
    }
}
