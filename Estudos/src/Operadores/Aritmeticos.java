package Operadores;
/**
 * @author Christian Lopes de Oliveira
 *
 */
public class Aritmeticos {
// Comentar o c�digo com Ctrl + 7

	public void soma(int valor1, int valor2) {
		int resul = valor1 + valor2;
		System.out.println("Resultdo da soma " + resul);
	}
	
	public void  subtracao(int valor1, int valor2) {
		int resul = valor1 - valor2;
		System.out.println("Resultdo da subtra��o " + resul);
	}
	
	public void multiplicacao(int valor1, int valor2) {
		int resul = valor1 * valor2;
		System.out.println("Resultdo da multiplica��o " + resul);
	}
	
	public void divisao(int valor1, int valor2) {
		int resul = valor1 / valor2;
		System.out.println("Resultdo da divisao " + resul);
	}
	
	public void resto(int valor1, int valor2) {
		int resul = valor1 % valor2;
		System.out.println("Resultdo da resto da divis�o " + resul);
	}
	
	public void loop() {
		for(int i = 0; i <= 5; i++) {
			int a = 0;
			int b = 0;
			a++;
			++b;
			System.out.println("Loop a " + a);
			System.out.println("Loop b " + b);
		}
	}

}
