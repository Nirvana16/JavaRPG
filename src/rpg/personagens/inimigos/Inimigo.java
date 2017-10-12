 package rpg.personagens.inimigos;

import rpg.personagens.Personagem;
import rpg.personagens.Racas;

public abstract class Inimigo extends Personagem {

//ATRIBUTOS ===================================================================================	
	private int experiencia;

//CONSTRUTORES ===================================================================================	
	public Inimigo(){
		
	}	
	public Inimigo(Racas raca){
		switch (raca){
			case ZUMBI:
				System.out.println("Raca: Zumbi");
				break;
			case HUMANO:
				System.out.println("Raca: Humano");
				break;
			case ELFO:
				System.out.println("Raca: Elfo");
				break;
			case GOBlIN:
				System.out.println("Raca: Goblin");
				break;
			default:
				System.out.println("Escolha uma Raca Correta");
				break;
		}
	}
	
//METODOS ===================================================================================
	

}
