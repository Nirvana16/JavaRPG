package rpg.personagens;

public class Jogador extends Personagem {

//ATRIBUTOS ===================================================================================
	private int PontosDeMagia, ExpAtual, ExpUP;

//CONSTRUTORES ===================================================================================	
//	public Jogador(){		
//		System.out.println("Construiu um jogador");	
//	}
	
	public Jogador(){}
	
//METODOS ===================================================================================	
	@Override
	public void atacar(){
		System.out.println("Atacou");
		
	}
	@Override
	public void defender(){
		System.out.println("Block");
		
	}
	@Override
	public void usarMagia(){
		System.out.println("Casting");
		
	}

}
