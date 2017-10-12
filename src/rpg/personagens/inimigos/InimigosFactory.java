package rpg.personagens.inimigos;

public class InimigosFactory {	
	public static final Inimigo retornarNovoInimigo(RacasEnum raca) {
		Inimigo retorno = null;
		switch(raca) {
			case ZUMBI:
				retorno = new Zumbi();
				// tambem poderia ser assim, sem o retorno acima
				// return new Zumbi();
				break;
			case HUMANO:
				retorno = new Humano();
				break;
			case ELFO:
				retorno = new Elfo();
				break;
			case GOBlIN:
				retorno = new Goblin();
				break;
			default:
				System.out.println("Escolha uma Raca Correta");
				break;
		}		
		return retorno;
		
	}

}
