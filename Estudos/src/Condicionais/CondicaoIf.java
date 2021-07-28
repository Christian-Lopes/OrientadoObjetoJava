package Condicionais;

import javax.swing.JOptionPane;

/**
 * @author Christian Lopes de Oliveira 
 * Date: 27/09/2021 
 * Program: Trabalhando com estrutura de condição if-else. 
 * Linkedin:christian-lopes-dev
 *
 */

public class CondicaoIf {

	public static void ifSimples() {
		Object[] op = { "Masculino", "Feminino" };

		String resp = (String) JOptionPane.showInputDialog(null, "Selecione o sexo:\n", "Pesquisa",
				JOptionPane.PLAIN_MESSAGE, null, op, "Masculino");

		if (resp == null) {
			JOptionPane.showMessageDialog(null, "Você pressionou Cancel.");
		}
		if (resp == "Masculino") {
			JOptionPane.showConfirmDialog(null, "Você é homem.");
		}
		if (resp == "Feminino") {
			JOptionPane.showMessageDialog(null, "Você é uma mulher.");
		}
		System.exit(0);
	}
	
	public static void ifElse() {
		String aux = JOptionPane.showInputDialog("Forneça o número do mês.");
		
		if(aux != null) {
			try {
				int mes = Integer.parseInt(aux);
				if(mes >= 1 && mes <= 12) {
					JOptionPane.showMessageDialog(null,"Número do mês válido!\n" + mes);
				} else {
					JOptionPane.showMessageDialog(null, "Número do mês inválido!\n" + mes);
				}
			} catch (NumberFormatException erro) {
				// TODO: handle exception
				JOptionPane.showInputDialog(null, "Digite apenas valores inteiros." + erro);
			}
		} else {
			JOptionPane.showConfirmDialog(null, "Operação Cancelada!");
		}
		System.exit(0);
	}
	
	public static void ifElseAninhado() {
		String aux = JOptionPane.showInputDialog("Forneça o número do mês.");
		if(aux != null) {
			try {
				int mes = Integer.parseInt(aux);
				if(mes == 1) {
					aux = "Janeiro";
				}else if(mes == 2) {
					aux = "Fevereiro";
				}else if(mes == 3) {
					aux = "Março";
				}else if(mes == 4) {
					aux = "Abril";
				}else if(mes == 5) {
					aux = "Maio";
				}else if(mes == 6) {
					aux = "Junho";
				}else if(mes == 7) {
					aux = "Julho";
				}else if(mes == 8) {
					aux = "Agosto";
				}else if(mes == 9) {
					aux = "Setembro";
				}else if(mes == 10) {
					aux = "Outubro";
				}else if(mes == 11) {
					aux = "Novembro";
				}else if(mes == 12) {
					aux = "Dezembro";
				}else {
					aux = "Mês desconhecido.";
				}
				
				JOptionPane.showMessageDialog(null, aux);
				
			} catch (NumberFormatException erro) {
				JOptionPane.showMessageDialog(null, "Digite apenas valores inteiros." + erro);
			}
		}
		System.exit(0);
	}
}
