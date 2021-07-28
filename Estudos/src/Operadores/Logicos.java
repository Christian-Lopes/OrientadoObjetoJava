package Operadores;

public class Logicos {

	public void logicoE(int valor, int valor2) {
		if(valor == valor2 && valor + valor == 2) {
			System.out.println("Informações verdadeiras!");
		}else {
			System.out.println("Informações são falsas!");
		}
	}
	
	public void logicoOU(int valor, int valor2) {
		if(valor == valor2 || valor2 + valor == 8) {
			System.out.println("Todas ou uma informação é verdadeira!");	
		}else {
			System.out.println("Todas as informações são falsas!");
		}
	}
	
	public void negação(int valor, int valor2) {
		boolean negar = valor == valor2;
		if(!negar) {
			System.out.println("Informação é falsa mais eu vou aprová la!");
		}else {
			System.out.println("Informação é vedadeira mais eu não vou aprová la!");
		}
	}
}
