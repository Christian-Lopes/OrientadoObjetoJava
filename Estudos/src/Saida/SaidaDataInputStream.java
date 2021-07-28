package Saida;

import java.io.DataInputStream;
import java.io.IOException;

public class SaidaDataInputStream {

	public void saidaDIS() throws IOException {
		String s;
		float comprimento, largura, area, perimetro;
		DataInputStream dado;

		try {
			System.out.println("Informe o comprimento da área:");
			dado = new DataInputStream(System.in);
			s = dado.readLine();
			comprimento = Float.parseFloat(s);
			
			System.out.println("Informe a largura da área:");
			dado = new DataInputStream(System.in);
			s = dado.readLine();
			largura = Float.parseFloat(s);
			
			area = comprimento * largura;
			perimetro = (comprimento * 2) + (largura * 2);
			
			System.out.println("A valor da área: " + area);
			System.out.println("O valor do perimetro: " + perimetro);

		} catch (NumberFormatException error) {
			System.out.println("Houve um erro: " + error);
		}
	}
}
