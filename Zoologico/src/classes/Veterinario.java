package classes;

import java.util.ArrayList;
import java.util.List;

public class Veterinario {

	private String nome;
	private List<Animal> animais;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Veterinario() {
		animais = new ArrayList<Animal>();
	}
	
	public void atenderAnimal(Animal animalSerAtendido ) {
		animais.add(animalSerAtendido);
	}
	
	public void deixarAtender(int indiceAnimal) {
		animais.remove(indiceAnimal);
	}
	
	public void listaAnimaisAtendidos() {
		System.out.println("Lista de animais atendidos.");
		
		for(int i = 0; i < animais.size(); i++) {
			System.out.println("   __" + animais.get(i).getNome());
		}
	}
}
