package ImpostoImovel;

import javax.swing.JOptionPane;

public class ImpostoImovel {

	public void calcularImposto() {
		String aux;
		
		aux = JOptionPane.showInputDialog("Informe o valor da Transa��o: ");
		float valorTransacao = Float.parseFloat(aux);
		
		aux = JOptionPane.showInputDialog("Informe o valor Venal: ");
		float valorVenal = Float.parseFloat(aux);
		
		aux = JOptionPane.showInputDialog("Informe a porcetagem do imposto: ");
		int imposto = Integer.parseInt(aux);
		
		if(valorTransacao > valorVenal) {
			float valorImposto = valorTransacao * imposto/100;
			JOptionPane.showMessageDialog(null, "O valor do imposto � " + valorImposto + " reais.");
		}else {
			float valorImposto = valorVenal * imposto/100;
			JOptionPane.showMessageDialog(null, "O valor do imposto � " + valorImposto + " reais.");
		}
	
	}
	
}
