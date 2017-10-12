package rpg;

import rpg.personagens.inimigos.Inimigo;
import rpg.personagens.inimigos.InimigosFactory;
import rpg.personagens.inimigos.RacasEnum;

public class Rpg {

	public static void main(String[] args) {
		
		Inimigo npc = InimigosFactory.retornarNovoInimigo(RacasEnum.ZUMBI);
		System.out.println(npc);
			
	}

}
