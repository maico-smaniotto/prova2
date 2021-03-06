class Palavra extends Objeto implements Rotacionavel {
	private String texto;
	private boolean negrito;
	private boolean italico;
	private boolean sublinhado;
	private int anguloRotacao;
	
	public Palavra(String texto) {
		this.setTexto(texto);
		this.setNegrito(false);
		this.setItalico(false);
		this.setSublinhado(false);
	}	
	public String getTexto() {
		return this.texto;
	}	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public boolean getNegrito() {
		return this.negrito;
	}
	public void setNegrito(boolean negrito) {
		this.negrito = negrito;
	}
	public boolean getItalico() {
		return this.italico;
	}
	public void setItalico(boolean italico) {
		this.italico = italico;
	}
	public boolean getSublinhado() {
		return this.sublinhado;
	}
	public void setSublinhado(boolean sublinhado) {
		this.sublinhado = sublinhado;
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