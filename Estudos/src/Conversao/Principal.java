package Conversao;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conversoes teste = new Conversoes();
		System.out.println("Convertendo um número inteiro.");
		teste.converteInt(5);
		System.out.println("Convertendo um número float.");
		teste.converteFloat((float) 3.4);
		System.out.println("Convertendo um número double.");
		teste.converteDouble(5.0);
		System.out.println("Convertendo uma string em um vetor.");
		teste.converteString("Christian");
		System.out.println("Converter strings em números.");
		teste.converteNumberString("10");
		System.out.println("Converte um vetor em uma string.");
		//Criando um vetor
		char a[] = new char[10];
		a[0] = 'C';
		a[1] = 'h';
		a[2] = 'r';
		teste.converteVetor(a);
		
		//Criando uma array para string
		//Dois elementos o 0 e o elemento 1.
		String nome[] = new String[2];
		nome[0] = "Christian";
		nome[1] = "Kece";
		
		for(int i = 0; i < nome.length; i++) {
			System.out.println(nome[i]);
		}
		
		
		
	}
}
