package Operadores;

public class Principal {

	public static void main(String[] args) {
		int valor1 = 5;
		int valor2 = 5;
		
		//Operadores aritimético
		Aritmeticos arit = new Aritmeticos();
		arit.soma(valor1, valor2);
		arit.subtracao(valor1, valor2);
		arit.multiplicacao(valor2, valor2);
		arit.divisao(valor1, valor2);
		arit.resto(valor1, valor2);

		// Pre incremento
		int valor3 = valor1++;
		System.out.println(valor3 + " " + valor1);
		// Pos incremento
		valor3 = ++valor2;
		System.out.println(valor3 + " " + valor2);
		
		//Operadores Relacionais
		Relacionais rel = new Relacionais();
		rel.igualdade(10, 50);
		rel.diferente(10, 40);
		rel.maiorIgual(12, 10);
		
		//Operadores Lógicos
		Logicos log = new Logicos();
		
		log.logicoE(2, 2);
		log.logicoOU(2, 2);
		log.negação(5, 5);
	}

}
