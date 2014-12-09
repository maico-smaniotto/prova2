class Main {
	public static void main(String[] args) {
		Documento doc = new Documento();
		
		Palavra p1 = new Palavra("teste");
		doc.adicionaElemento(p1);
		
		Palavra p2 = new Palavra("teste2");
		p2.setNegrito(true);
		doc.adicionaElemento(p2);
		
		Video v = new Video();
		v.setDimensoes(320, 240);
		doc.adicionaElemento(v);
		
		Figura f = new Figura(150, 150);
		doc.adicionaElemento(f);
		
		int n = doc.getQtdElementos();
		Objeto obj;
		for (int i = 0; i < n; i++) {
			obj = doc.getElemento(i);
			if (obj instanceof Rotacionavel) {
				((Rotacionavel)obj).setAnguloRotacao(90);
			} else if (obj instanceof Redimensionavel) {
				((Redimensionavel)obj).setLargura(300);
			}
		}
	}
}