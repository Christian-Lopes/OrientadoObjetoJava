package Desconto;

import java.io.*;

public class Desconto {

	public void desconto() throws IOException{
		String s;
		BufferedReader dado;
		try {
			System.out.println("Informe o valor do produto: ");
			dado = new BufferedReader(new InputStreamReader(System.in));
			s = dado.readLine();
			float valor = Float.parseFloat(s);
			
			System.out.println("Informa quanto porcento de desconto: ");
			dado = new BufferedReader(new InputStreamReader(System.in));
			s = dado.readLine();
			int porcento = Integer.parseInt(s);
			
			float valorDesconto = valor * porcento /100;
			float valorFinal = valor - valorDesconto;
			
			System.out.println("Desconto é:" + valorDesconto);
			System.out.println("Valor final: " + valorFinal);
		}catch(NumberFormatException erro) {
			System.out.println("Erro: " + erro);
		}
	}

}
