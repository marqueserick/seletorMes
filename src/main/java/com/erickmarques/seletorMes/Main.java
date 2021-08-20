package com.erickmarques.seletorMes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int mes = 1;
		System.out.println("Digite um valor de 1 a 12 para selecionar um m�s");

		try {
			mes = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Valor inserido � inv�lido\n" + "O m�s 1 ser� exibido");
			mes = 1;
		} catch (Exception e) {
			System.out.println("Ocorreu um erro inesperado\n" + "O m�s 1 ser� exibido");
			mes = 1;
		}
		System.out.println(exibirMes(mes));

	}

	public static String exibirMes(int mes) {
		String mesSelecionado = "Voc� selecionou o m�s de ";

		switch (mes) {
		case 1:
			mesSelecionado += "Janeiro";
			break;
		case 2:
			mesSelecionado += "Fevereiro";
			break;
		case 3:
			mesSelecionado += "Mar�o";
			break;
		case 4:
			mesSelecionado += "Abril";
			break;
		case 5:
			mesSelecionado += "Maio";
			break;
		case 6:
			mesSelecionado += "Junho";
			break;
		case 7:
			mesSelecionado += "Julho";
			break;
		case 8:
			mesSelecionado += "Agosto";
			break;
		case 9:
			mesSelecionado += "Setembro";
			break;
		case 10:
			mesSelecionado += "Outubro";
			break;
		case 11:
			mesSelecionado += "Novembro";
			break;
		case 12:
			mesSelecionado += "Dezembro";
			break;
		default:
			mesSelecionado = "Valor selecionando n�o corresponde a um m�s do ano";
		}

		return mesSelecionado;
	}

}
