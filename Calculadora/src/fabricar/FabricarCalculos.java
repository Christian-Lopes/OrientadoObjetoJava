package fabricar;

import interfaces.CalculosMatematico;
import classes.*;

public class FabricarCalculos {

	public CalculosMatematico criarCalculo(int numero1, int numero2, String calculo) {
		if (calculo.equals("+")) {
			return new Adicao(numero1, numero2);
		}else if (calculo.equals("-")) {
			return new Subtracao(numero1, numero2);
		}else if (calculo.equals("*")) {
			return new Multiplicacao(numero1, numero2);
		}else if (calculo.equals("/")) {
			return new Divisao(numero1, numero2);
		}else {
			return null;
		}
	}
}
