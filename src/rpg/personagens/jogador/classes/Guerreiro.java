package rpg.personagens.jogador.classes;

import rpg.itens.equipamentos.armas.Escudo;
import rpg.itens.equipamentos.armas.Espada;
import rpg.personagens.jogador.Jogador;

public class Guerreiro extends Jogador {
	
	public Guerreiro () {
		super(TipoClasseEnum.GUERREIRO);
	}
	
	private Espada espada;
	private Escudo escudo;
	
	

}
