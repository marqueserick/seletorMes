package com.erickmarques.seletorMes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static com.erickmarques.seletorMes.Main.exibirMes;

public class MainTest {
	
	@Test
	void deveExibirMesJaneiro() {
		assertEquals("Você selecionou o mês de Janeiro", exibirMes(1));
		
	}
	
	@Test
	void deveExibirMesMaio() {
		assertEquals("Você selecionou o mês de Maio", exibirMes(5));
		
	}
	
	@Test 
	void naoDeveExibirMes() {
		assertEquals("Valor selecionando não corresponde a um mês do ano", exibirMes(13));
	}

}
