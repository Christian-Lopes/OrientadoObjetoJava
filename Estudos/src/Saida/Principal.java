package Saida;


import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		SaidaDataInputStream saida1 = new SaidaDataInputStream();
		saida1.saidaDIS();
		
		SaidaBufferedReader saida2 = new SaidaBufferedReader();
		saida2.saidaBufferedR();
		
		SaidaScanner saida3 = new SaidaScanner();
		saida3.saidaScanner();
		
	}
}
