package Operadores;

public class Logicos {

	public void logicoE(int valor, int valor2) {
		if(valor == valor2 && valor + valor == 2) {
			System.out.println("Informa��es verdadeiras!");
		}else {
			System.out.println("Informa��es s�o falsas!");
		}
	}
	
	public void logicoOU(int valor, int valor2) {
		if(valor == valor2 || valor2 + valor == 8) {
			System.out.println("Todas ou uma informa��o � verdadeira!");	
		}else {
			System.out.println("Todas as informa��es s�o falsas!");
		}
	}
	
	public void nega��o(int valor, int valor2) {
		boolean negar = valor == valor2;
		if(!negar) {
			System.out.println("Informa��o � falsa mais eu vou aprov� la!");
		}else {
			System.out.println("Informa��o � vedadeira mais eu n�o vou aprov� la!");
		}
	}
}
