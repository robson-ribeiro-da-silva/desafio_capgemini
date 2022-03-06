package br.com.projetocapgemini.teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.projetocapgemini.model.Encripta;

class TesteEncripta {

	/*
	 * Testando o método que encripta a mensagem
	 */
	@Test
	void test() {
		
        Encripta encripta = new Encripta();
        
        String texto = "ola mundo";
        encripta.setString_s(texto); 
        
        String teste = encripta.encriptar_mensagem();
        assertEquals(teste, "omd luo an  ");
	}

}
