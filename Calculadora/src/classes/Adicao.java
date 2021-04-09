package classes;

public class Adicao extends Operacoes{

	public Adicao(int numero1, int numero2) {
		super(numero1, numero2);
	}

	@Override
	protected int doCalcular() {
		return getNumero1() + getNumero2();
	}

}
