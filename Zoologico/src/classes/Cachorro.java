package classes;

public class Cachorro extends Animal {

	public Cachorro(String nome, String especie, int idade) {
		super(nome, especie, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirBarulho() {
		if(estaVivo) {
			System.out.println("Cachorro late..");
		}else {
			System.out.println("Infelizmente o cachorro morreu.");
		}
	}
	
	@Override
	public boolean adulto() {
		if(estaVivo) {
			return idade >= 5;
		}else {
			return false;
		}
	}

}
