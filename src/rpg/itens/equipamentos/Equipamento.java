package rpg.itens.equipamentos;

public abstract class Equipamento {
	
	private String nmEquipamento;
	private TipoEquipamentoEnum tipoEquipamento;
	private int pontosDeVida, forca, velocidade, defesa;
	
	public String getNmEquipamento() {
		return nmEquipamento;
	}
	public void setNmEquipamento(String nmEquipamento) {
		this.nmEquipamento = nmEquipamento;
	}
	public TipoEquipamentoEnum getTipoEquipamento() {
		return tipoEquipamento;
	}
	public void setTipoEquipamento(TipoEquipamentoEnum tipoEquipamento) {
		this.tipoEquipamento = tipoEquipamento;
	}
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
	

}
