package Numero;

/**
 * @author Christian Lopes de Oliveira
 *
 */
public class Primitivo {
	
	char caractere = 'c';
	byte validar = 8;

	public void imprimir() 
	{
		System.out.println("O char tem: " + caractere + " bits. Valor igual a /u0000 a /uFFFF.");
		System.out.println("O booleano tem: " + validar + " bits. Valor igual a true ou false.");
	}
}
