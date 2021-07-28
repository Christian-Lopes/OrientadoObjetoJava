package Aluno;

import javax.swing.JOptionPane;

/**
 * @author: Christian Lopes de Oliveira
 * Date: 27/07/2021
 *
 */
public class Nota {

	public void media() {

		String aux;

		try {
			aux = JOptionPane.showInputDialog("Informe a primeira nota: ");
			float nota1 = Float.parseFloat(aux);

			aux = JOptionPane.showInputDialog("Informe a segunda nota: ");
			float nota2 = Float.parseFloat(aux);

			aux = JOptionPane.showInputDialog("Informe a nota do trabalho: ");
			float notaTrabalho = Float.parseFloat(aux);
			
			float media = (nota1 + nota2 + notaTrabalho)/3;
			
			if(media >=  6) {
				System.out.println("A média do aluno foi aprovado com a média " + media + ".");
			}else {
				System.out.println("A média do aluno foi reprovado com a média " + media + ".");
			}

		} catch (NumberFormatException erro) {
			System.out.println("Erro: " + erro);
		}

	}
}
