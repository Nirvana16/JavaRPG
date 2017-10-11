package rpg;

import rpg.personagens.Jogador;
import rpg.personagens.Racas;
import rpg.personagens.inimigos.Inimigo;

public class Rpg {

	public static void main(String[] args) {
		
		Jogador player1 = new Jogador("Adrubal 2");
		//player1.setNome("Asdrubal");
		player1.atacar();
		player1.exibirNome();
		
		
		Inimigo globin = new Inimigo(Racas.HUMANO);
		globin.setNome("Murloc");
		globin.exibirNome();
		
		
	}

}
