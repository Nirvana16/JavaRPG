package rpg.personagens.jogador;

import rpg.itens.equipamentos.armadura.Armadura;
import rpg.itens.equipamentos.armadura.Botas;
import rpg.itens.equipamentos.armadura.Elmo;
import rpg.itens.equipamentos.armadura.Luvas;
import rpg.personagens.Personagem;
import rpg.personagens.jogador.classes.TipoClasseEnum;

public abstract class Jogador extends Personagem {
	
	public Jogador(){}
	
	public Jogador(TipoClasseEnum classe){
		this.classe = classe;
	}

//ATRIBUTOS ===================================================================================
	private int ExpAtual, ExpUP;
	private TipoClasseEnum classe;
	
	private Elmo elmo;
	private Armadura armadura;
	private Botas botas;
	private Luvas luvas;
	
	
	public int getExpAtual() {
		return ExpAtual;
	}

	public void setExpAtual(int expAtual) {
		ExpAtual = expAtual;
	}

	public int getExpUP() {
		return ExpUP;
	}

	public void setExpUP(int expUP) {
		ExpUP = expUP;
	}

	public Elmo getElmo() {
		return elmo;
	}

	public void setElmo(Elmo elmo) {
		this.elmo = elmo;
	}

	public Armadura getArmadura() {
		return armadura;
	}

	public void setArmadura(Armadura armadura) {
		this.armadura = armadura;
	}

	public Botas getBotas() {
		return botas;
	}

	public void setBotas(Botas botas) {
		this.botas = botas;
	}

	public Luvas getLuvas() {
		return luvas;
	}

	public void setLuvas(Luvas luvas) {
		this.luvas = luvas;
	}

	public TipoClasseEnum getClasse() {
		return classe;
	}

	public void setClasse(TipoClasseEnum classe) {
		this.classe = classe;
	}
	
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
