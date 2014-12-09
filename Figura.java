class Figura extends Objeto implements Redimensionavel, Rotacionavel {
	private int anguloRotacao;
	private int altura;
	private int largura;
	
	public int getAltura() {
		return this.altura;
	}	
	public void setAltura(int altura) {
		this.altura = altura;
	}	
	public int getLargura() {
		return this.largura;
	}	
	public void setLargura(int largura) {
		this.largura = largura;
	}	
	public void setDimensoes(int altura, int largura) {
		this.setAltura(altura);
		this.setLargura(largura);
	}
	public int getAnguloRotacao() {
		return this.anguloRotacao;
	}	
	public void setAnguloRotacao(int angulo) {
		this.anguloRotacao = angulo;
	}	
}