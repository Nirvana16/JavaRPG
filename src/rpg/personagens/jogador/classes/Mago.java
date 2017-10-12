package rpg.personagens.jogador.classes;

import rpg.itens.equipamentos.armas.Cajado;
import rpg.personagens.jogador.Jogador;

public class Mago extends Jogador {
	
	public Mago () {
		super(TipoClasseEnum.MAGO);
	}
	
	private int PontosDeMagia;
	
	private Cajado cajado;
	
}
