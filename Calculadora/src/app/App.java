package app;

import fabricar.FabricarCalculos;
import interfaces.CalculosMatematico;

public class App {

	public static void main(String[] args) {
		
		String calculo = "/";
		int numero1 = 4;
		int numero2 = 2;
		
		FabricarCalculos fabrica = new FabricarCalculos();
		CalculosMatematico calcular = fabrica.criarCalculo(numero1, numero2, calculo);
		
		if (calcular != null) {
			System.out.println(calcular.calcular());
		}else {
			System.out.println("Operação inválida.");
		}
	}

}
 