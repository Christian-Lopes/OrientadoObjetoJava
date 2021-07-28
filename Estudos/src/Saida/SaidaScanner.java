package Saida;

import java.io.IOException;
import java.util.*;

public class SaidaScanner {
	
	public void saidaScanner() throws IOException{
		
		float comprimento, largura, area, perimetro;
		
		Scanner dado;
		
		try {
			System.out.println("Informe o comprimento: ");
			dado = new Scanner(System.in);
			comprimento = dado.nextFloat();
			
			System.out.println("Informe a largura: ");
			dado = new Scanner(System.in);
			largura = dado.nextFloat();
			
			area = comprimento * largura;
			perimetro = (comprimento * 2) + (largura * 2);
			
			System.out.println("A área: " + area);
			System.out.println("O perimetro: " + perimetro);
			
			
		}catch(NumberFormatException erro) {
			
		}
	}
}
