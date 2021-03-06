package classes;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {

	private String nome;
	private List<Animal> animal;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Zoologico() {
		animal = new ArrayList<Animal>();
	}
	
	public void adicionarAnimail(Animal addAnimal) {
		this.animal.add(addAnimal);
	}
	
	public void removerAnimal(int removeItem) {
		this.animal.remove(removeItem);
	}
	
	public void listarAnimal() {
		System.out.println("Lista de animais do Zool?gico");
		for (int i = 0; i < animal.size(); i++) {
			System.out.println("    -- " + animal.get(i).getEspecie());
		}
	}
}
