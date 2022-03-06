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
 * Classe que encripta uma mensagem para um formato codificado
 */
public class Encripta {
    
    private String string_s;
    private int raizquadrada;
    private String grid[][];
    
    /*
     * Remove os espaços em branco de uma mensagem (String)
     */
    public void remover_espacos(){
       
        String resultado = string_s.replaceAll("\\s+","");
        setString_s(resultado);
    }
    
    /*
     * Conta o total de caracteres de uma mensagem (String)
     */
    public void contar_caracteres(){
        
        double raiz = Math.sqrt(string_s.length());
        
        setRaizquadrada((int) Math.ceil(raiz));
        System.out.println(" String: "+getString_s()+", Tamanho: "+string_s.length()+", A raiz "
        		+ "é: ~="+ raizquadrada+".");
    }

    /*
     * Gera uma matriz a partir da String informada:
     * Incialmente converte a String em um Array de Objetos.
     * Posteriormente converte o Array em uma Matriz de String 
     */
    public void gerar_grid() {
        
        Object[] matriz = Arrays.stream(string_s.substring(0, string_s.length() - 0).split("")).map(String::trim).toArray();

        Object[][] resultado = new String[raizquadrada][raizquadrada];
        for(int i=0; i<matriz.length; i++) {
            resultado[i/raizquadrada][i%raizquadrada] = matriz[i];
        }
        setGrid((String[][]) resultado);
        
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[i].length; j++) {
                if(grid[i][j] == null){
                    grid[i][j] = " ";
                }
            }
        }
    }
    
    /*
     * Imprime a matriz com o formato inicial
     */
    public void imprimir_grid(){
        System.out.println(" Imprimindo o Grid com o formato Inicial:");
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[i].length; j++) {
                System.out.print(grid[i][j] + "");
            }
            System.out.println(" ");
        }
    }
    
    /*
     * Inicializa a sequência de métodos a seguir:
     * 1° - remove os espços da String
     * 2° - conta o total de catacteres
     * 3° - gera a matriz incial
     * 4º - imprime a matriz inicial
     * 
     * Encripta a mensagem informada.
     * Imprime a matriz com o formato final após a encriptação
     */
    public void encriptar_mensagem(){
        
        this.remover_espacos();
        this.contar_caracteres();
        this.gerar_grid();
        this.imprimir_grid();
        
        System.out.println("\n Imprimindo o Grid com o formato Final:");
        
        String mensagem = "";
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid.length; j++) {
                mensagem = mensagem + grid[j][i];
                System.out.print(grid[j][i]+ "");
            }
            mensagem = mensagem + " ";
            System.out.println(" "); //muda de linha
        }
        System.out.println("\n A mensagem Encriptada é: "+mensagem);
    }
    
    public String getString_s() {
        return string_s;
    }

    public void setString_s(String string_s) {
        this.string_s = string_s;
    }

    public int getRaizquadrada() {
        return raizquadrada;
    }

    public void setRaizquadrada(int raizquadrada) {
        this.raizquadrada = raizquadrada;
    }

    public String[][] getGrid() {
        return grid;
    }

    public void setGrid(String[][] grid) {
        this.grid = grid;
    }
    
}
