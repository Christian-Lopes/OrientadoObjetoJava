package classes;

import interfaces.CalculosMatematico;

public abstract class Operacoes implements CalculosMatematico {
	
	private int numero1;
	private int numero2;
	
	public Operacoes(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	@Override
	public Boolean validar() {
		// TODO Auto-generated method stub
		return numero1 >= 0 && numero2 >= 0;
	}

	@Override
	public int calcular() {
		// TODO Auto-generated method stub
		if(validar()) {
			return doCalcular();
		}else {
			return -1;
		}
	}
	
	protected abstract int doCalcular();

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

}
