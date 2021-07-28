
package Numero;

/**
 * @author Christian Lopes de Oliveira
 *
 */
public class Numero {
	
	byte primeiroMenor = 8;		//Número do tipo byte
	short segundoMenor = 16;	//Número do tipo short
	int segundoMaior = 32;		//Número do tipo int
	long primeiroMaior = 64;	//Número do tipo long
	
	float menorFloat = 32;		//Número do tipo float
	double maiorDouble = 64; 	//Número do tipo double
	
	int padrao;					//Valor default das variáveis primitivas, exceto a boolean
	boolean teste;				//Valor default das variável boolean
	
	final int TESTE = 20;		//Informando uma constante
	
	public void  numberOut() 
	{
		System.out.println("O inteiro byte tem: " + primeiroMenor + " bits. Valor igual a 127.");
		System.out.println("O inteiro short tem: " + segundoMenor + " bits. Valor igual a 32.767.");
		System.out.println("O inteiro int tem: " + segundoMaior + " bits. Valor igual a 2.147.483.647.");
		System.out.println("O inteiro long tem: " + primeiroMaior + " bits. Valor igual a 9.223.372.036.854.775.807.");
		
		System.out.println("O fracionário float tem: " + menorFloat + " bits. Valor igual a 3.40292347E+38.");
		System.out.println("O fracionário double tem: " + maiorDouble + " bits. Valor igual a 1.79769313486231570E+308.");
		
		System.out.println("O valor padrão das variáveis primitivas é " + padrao + ".");
		System.out.println("Exceto o tipo booleano, onde o valor padrão é " + teste + ".");
		System.out.println("Esse valor é de uma constate " + TESTE + ".");
	}
}
