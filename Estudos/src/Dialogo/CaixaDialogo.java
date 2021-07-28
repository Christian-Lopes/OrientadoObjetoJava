package Dialogo;

import javax.swing.JOptionPane;

public class CaixaDialogo {
	
	public void caixaDeDialogo() {
		
		String aux;
		float area, perimetro;
		
		try {
			aux = JOptionPane.showInputDialog("Infomer o Comprimento: ");
			float comprimento = Float.parseFloat(aux);
			
			aux = JOptionPane.showInputDialog("Informe a largura: ");
			float largura  = Float.parseFloat(aux);
			
			area = comprimento * largura;
			perimetro = (comprimento * 2) + (largura * 2);
			
			JOptionPane.showMessageDialog(null,"A �rea " + area + " e o perimetro � " + perimetro);
			
		}catch(NumberFormatException erro){
			System.out.println("Erro! " + erro);
		}
	}
}
