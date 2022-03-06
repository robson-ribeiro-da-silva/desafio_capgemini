/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetocapgemini.app;

import br.com.projetocapgemini.model.Encripta;

/**
 *
 * @author robso
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\t Testando a primeira Mensagem");
        Encripta encripta = new Encripta(); //instancia um objeto da classe
        
        String texto = "ola mundo"; //informa a mensagem
        encripta.setString_s(texto); //passa a mensagem para a String da classe
        System.out.println(" Mensagem inicial: "+texto);
        System.out.println("\n A mensagem Encriptada é: "+encripta.encriptar_mensagem()); //encripta a mensagem
        
        System.out.println("\n\n\t Testando a segunda Mensagem");
        Encripta encripta_2 = new Encripta();
        
        String texto_2 = "tenha um bom dia"; //informa a segunda mensagem
        encripta_2.setString_s(texto_2); //passa a segunda mensagem para a String da classe
        System.out.println(" Mensagem inicial: "+texto_2);
        System.out.println("\n A mensagem Encriptada é: "+encripta_2.encriptar_mensagem()); //encripta a segunda mensagem
        
        System.out.println("\n");
    }
    
}
