package com.erickmarques.seletorMes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static com.erickmarques.seletorMes.Main.exibirMes;

public class MainTest {
	
	@Test
	void deveExibirMesJaneiro() {
		assertEquals("Voc� selecionou o m�s de Janeiro", exibirMes(1));
		
	}
	
	@Test
	void deveExibirMesMaio() {
		assertEquals("Voc� selecionou o m�s de Maio", exibirMes(5));
		
	}
	
	@Test 
	void naoDeveExibirMes() {
		assertEquals("Valor selecionando n�o corresponde a um m�s do ano", exibirMes(13));
	}

}
