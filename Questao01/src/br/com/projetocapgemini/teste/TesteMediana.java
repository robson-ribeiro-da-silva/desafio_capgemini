package br.com.projetocapgemini.teste;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.projetocapgemini.model.Mediana;

class TesteMediana extends Mediana {

	/*
	 * Testando o método que calcula a mediana da lista
	 */
	@Test
	public void test_calcula_mediana() {
		
		Mediana mediana = new Mediana(); 
		int arr[] = {9,2,1,4,6};
		mediana.setLista(arr);
		int teste = mediana.calcula_mediana();
		
		assertEquals(teste, 4);
	}

}
