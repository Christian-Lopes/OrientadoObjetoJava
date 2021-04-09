package classes;

public class Gato extends Animal {

	public Gato(String nome, String especie, int idade) {
		super(nome, especie, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirBarulho() {
		if(estaVivo) {
			System.out.println("Gato mia..");
		}else {
			System.out.println("Infelizmente o gato morreu.");
		}
	}


}
