class Figura extends Objeto implements Redimensionavel, Rotacionavel {
	private int anguloRotacao;
	private int altura;
	private int largura;
	
	public Figura() {
		this(100, 100);
	}
	public Figura(int largura, int altura) {
		this.setDimensoes(largura, altura);
		this.setAnguloRotacao(0);
	}
	public int getLargura() {
		return this.largura;
	}	
	public void setLargura(int largura) {
		this.largura = largura;
	}	
	public int getAltura() {
		return this.altura;
	}	
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public void setDimensoes(int largura, int altura) {
		this.setLargura(largura);
		this.setAltura(altura);
	}
	public int getAnguloRotacao() {
		return this.anguloRotacao;
	}	
	public void setAnguloRotacao(int angulo) {
		angulo = angulo % 360;
		if (angulo < 0) {
			angulo = angulo + 360;
		}
		this.anguloRotacao = angulo;
	}	
}