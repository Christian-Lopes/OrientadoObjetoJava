package Operadores;

public class Relacionais {

	public void igualdade(int num1, int num2) {
	   boolean result = num1 == num2;
	   if(result) {
		   System.out.println("N�meros iguais!");
	   }else {
		   System.out.println("N�meros s�o diferentes!");
	   }
	}
	
	public void diferente(int num1, int num2) {
		   boolean result = num1 != num2;
		   if(result) {
			   System.out.println("N�meros diferentes!");
		   }else {
			   System.out.println("N�meros s�o iguais!");
		   }
		}
	
	public void maiorIgual(int num1, int num2) {
		   boolean result = num1 >= num2;
		   if(result) {
			   System.out.println("N�meros � maior ou iguais!");
		   }else {
			   System.out.println("N�meros � menor!");
		   }
		}
	public void menorIgual(int num1, int num2) {
		   boolean result = num1 <= num2;
		   if(result) {
			   System.out.println("N�meros � menor ou iguais!");
		   }else {
			   System.out.println("N�meros � maior!");
		   }
		}
}
