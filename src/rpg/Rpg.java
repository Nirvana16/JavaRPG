package rpg;

import rpg.personagens.Racas;
import rpg.personagens.inimigos.Inimigo;
import rpg.personagens.inimigos.InimigosFactory;

public class Rpg {

	public static void main(String[] args) {
		
		Inimigo npc = InimigosFactory.retornarNovoInimigo(Racas.ZUMBI);
		System.out.println(npc);
			
	}

}
