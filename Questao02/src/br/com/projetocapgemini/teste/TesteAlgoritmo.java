package br.com.projetocapgemini.teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.projetocapgemini.model.Algoritmo;

class TesteAlgoritmo {

	
	/*
	 * Testando o método que calcula o total de elementos pares
	 */
	@Test
	void test() {
		Algoritmo algoritmo = new Algoritmo();
		int n[] = {1,5,3,4,2}; 
        
        algoritmo.setVetorN(n); 
        algoritmo.setValorX(2);;
        int teste = algoritmo.calcula_elementos_pares();
        
		assertEquals(teste, 3);
	}

}
