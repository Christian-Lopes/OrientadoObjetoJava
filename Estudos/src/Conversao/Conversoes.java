package Conversao;

public class Conversoes {

	public void converteInt(int valor) {
		float paraFloat = (float)valor;
		double  paraDouble = (double)valor;
		String paraString = String.valueOf(valor);
		
		System.out.println(paraFloat);
		System.out.println(paraDouble);
		System.out.println(paraString);
	}
	
	public void converteFloat(float valor) {
		int paraInt = (int)valor;
		double paraDouble = (double)valor;
		String paraString = String.valueOf(valor);
		
		System.out.println(paraInt);
		System.out.println(paraDouble);
		System.out.println(paraString);
	}
	
	public void converteDouble(double valor) {
		int paraInt = (int)valor;
		float paraFloat = (float)valor;
		String paraString = String.valueOf(valor);
		
		System.out.println(paraInt);
		System.out.println(paraFloat);
		System.out.println(paraString);
	}
	
	public void converteString(String frase) {
		char vetor[] = frase.toCharArray();
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]);
		}
		System.out.println("");
	}
	
	public void converteNumberString(String numero) {
		int paraInt = Integer.parseInt(numero);
		float paraFloat = Float.parseFloat(numero);
		double paraDouble = Double.parseDouble(numero);
		
		System.out.println(paraInt);
		System.out.println(paraFloat);
		System.out.println(paraDouble);	
	}
	
	public void converteVetor(char a[]) {
		String nome = new String(a);
		
		System.out.println(nome);
	}
	
	
}
