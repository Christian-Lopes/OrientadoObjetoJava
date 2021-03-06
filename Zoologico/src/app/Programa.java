package app;

import classes.Animal;
import classes.Cachorro;
import classes.Gato;
import classes.Veterinario;
import classes.Zoologico;

public class Programa {

	public static void main(String[] args) {
		Animal animal = new Cachorro("Amorinha", "Pug", 6);
		Gato gato = new Gato("Fiona", "Persa", 1);
		
		System.out.println("============================== CACHORRO ===========================");
		System.out.println("Ol?, seu animail ? " + animal.getNome() + " da ra?a " + animal.getEspecie() + "!");
		//cachorro.estaMorto();
		if(animal.adulto()) {
			System.out.println("Seu animal ? adulto!");
		}else {
			System.out.println("Seu animal ainda n?o ? adulto!");
		}
		System.out.println("Barulho do cachorro!");
		animal.emitirBarulho();
		System.out.println("============================== GATO ===========================");
		System.out.println("Ol?, seu animail ? " + gato.getNome() + " da ra?a " + gato.getEspecie() + "!");
		if(gato.adulto()) {
			System.out.println("Seu animal ? adulto!");
		}else {
			System.out.println("Seu animal ainda n?o ? adulto!");
		}
		System.out.println("Barulho do gato.");
		gato.emitirBarulho();
		Animal animal2 = new Cachorro("Amorinha", "Pit Bull", 6);
		Zoologico zoo = new Zoologico();
		zoo.setNome("Zoologico");
		zoo.adicionarAnimail(animal);
		zoo.adicionarAnimail(animal2);
		zoo.removerAnimal(0);
		System.out.println("Lista de animais do " + zoo.getNome());
		zoo.listarAnimal();
		
		Veterinario vet = new Veterinario();
		
		vet.setNome("Christian Lopes");
		vet.atenderAnimal(animal2);
		System.out.println("Animais atendios pelo veterin?rio " + vet.getNome() + ".");
		vet.listaAnimaisAtendidos();
	
		
		
	}

}
