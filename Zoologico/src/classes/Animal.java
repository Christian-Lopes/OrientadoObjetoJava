package classes;

public abstract class Animal implements Animavel{
	
	private String nome;
	private String especie;
	protected int idade;
	protected Boolean estaVivo;
	
	public Animal(String nome, String especie, int idade) {
		this.nome = nome;
		this.especie = especie;
		this.idade = idade;
		this.estaVivo = true;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Boolean estaVivo() {
		return estaVivo;
	} 
	
	public final void estaMorto() {
		 this.estaVivo = false;
	}
	
	public abstract void emitirBarulho();
	
	public boolean adulto() {
		if(estaVivo) {
			return idade >= 2;
		}else {
			return false;
		}
	}
}
