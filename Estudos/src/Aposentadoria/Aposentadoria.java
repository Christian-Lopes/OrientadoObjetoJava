package Aposentadoria;

import javax.swing.JOptionPane;

public class Aposentadoria {

	public void validarAposentadoria() {
		String aux;
		
		try {
			aux = JOptionPane.showInputDialog("Infome a idade: ");
			int idade = Integer.parseInt(aux);
			
			aux = JOptionPane.showInputDialog("Informe o sexo:[1] para masculino\n [2] para feminino");
			int sexo = Integer.parseInt(aux);
			
			aux = JOptionPane.showInputDialog("Informe quantos anos de contribui��o: ");
			int anosContribuicao = Integer.parseInt(aux);
			
			if(sexo == 1) {
				if(idade == 65 || anosContribuicao >= 35) {
					System.out.println("Voc� j� pode aposentar!");
				}else {
					int faltaContribuir = 35 - anosContribuicao;
					System.out.println("Falta " + faltaContribuir + " anos de contribui��o!");
				}
				
			}else if(sexo == 2) {
				if(idade == 60 || anosContribuicao >= 30) {
					System.out.println("Voc� j� pode aposentar!");
				}else {
					int faltaContribuir = 30 - anosContribuicao;
					System.out.println("Falta " + faltaContribuir + " anos de contribui��o!");
				}
			}else {
				System.out.println("Op�ao inv�lida" + sexo + ".");
			}
		}catch(NumberFormatException erro) {
			System.out.println("Erro" + erro);
		}
	}
}
