package rpg.personagens;

public abstract class Personagem {

//ATRIBUTOS ==========================================================================================
	protected String nome;
	private Racas raca; //Linkando ao Enumerator 
	protected int pontosDeVida, 
				  forca, 
				  velocidade,
				  defesa, 
				  nivel;

	
// GETTERS E SETTERS ==============================================================================	
	
	public int getPontosDeVida() {
		return pontosDeVida;
	}
	public void setPontosDeVida(int pontosDeVida) {
		this.pontosDeVida = pontosDeVida;
	}
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getDefesa() {
		return defesa;
	}
	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Racas getRaca() {
		return raca;
	}
	public void setRaca(Racas raca) {
		this.raca = raca;
	}

// CONSTRUTORES ==============================================================================	
	public Personagem(){}
	
	
// METODODOS ABASTRATOS ===================================================================================
	public abstract void atacar();
	public abstract void defender();
	public abstract void usarMagia();

	
	
	
}
