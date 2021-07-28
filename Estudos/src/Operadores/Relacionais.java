package Operadores;

public class Relacionais {

	public void igualdade(int num1, int num2) {
	   boolean result = num1 == num2;
	   if(result) {
		   System.out.println("Números iguais!");
	   }else {
		   System.out.println("Números são diferentes!");
	   }
	}
	
	public void diferente(int num1, int num2) {
		   boolean result = num1 != num2;
		   if(result) {
			   System.out.println("Números diferentes!");
		   }else {
			   System.out.println("Números são iguais!");
		   }
		}
	
	public void maiorIgual(int num1, int num2) {
		   boolean result = num1 >= num2;
		   if(result) {
			   System.out.println("Números é maior ou iguais!");
		   }else {
			   System.out.println("Números é menor!");
		   }
		}
	public void menorIgual(int num1, int num2) {
		   boolean result = num1 <= num2;
		   if(result) {
			   System.out.println("Números é menor ou iguais!");
		   }else {
			   System.out.println("Números é maior!");
		   }
		}
}
