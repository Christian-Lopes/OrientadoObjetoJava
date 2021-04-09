package classes;

public class Subtracao extends Operacoes {

	public Subtracao(int numero1, int numero2) {
		super(numero1, numero2);
	}
	
	@Override
	public Boolean validar() {
		
		return getNumero1() >= 0 && getNumero2() > 0;
	}

	@Override
	protected int doCalcular() {
		return getNumero1() - getNumero2();
	}

}
