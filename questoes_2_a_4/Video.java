class Video extends Objeto implements Redimensionavel {
	private int largura;
	private int altura;
	
	public Video() {
		this(100, 100);
	}
	public Video(int largura, int altura) {
		this.setDimensoes(largura, altura);
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
}