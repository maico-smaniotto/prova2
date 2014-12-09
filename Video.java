class Video extends Objeto implements Redimensionavel {
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
}