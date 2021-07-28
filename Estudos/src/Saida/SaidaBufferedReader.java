package Saida;

import java.io.*;

public class SaidaBufferedReader {
	
	public void saidaBufferedR() throws IOException {
		String s;
		float comprimento, largura, area, perimetro;
		BufferedReader dado;
		
		try {
			
			System.out.println("Informe o comprimento: ");
			dado = new BufferedReader(new InputStreamReader(System.in));
			s = dado.readLine();
			comprimento = Float.parseFloat(s);
			
			System.out.println("Informe a largura: ");
			dado = new BufferedReader(new InputStreamReader(System.in));
			s = dado.readLine();
			largura = Float.parseFloat(s);
			
			area = comprimento * largura;
			perimetro = (comprimento * 2) + (largura * 2);
			System.out.println("A área: " + area);
			System.out.println("O perimetro: " + perimetro);
		}catch(NumberFormatException erro) {
			System.out.println("Houve um erro: " + erro);
		}
	}

}
