import java.util.ArrayList;

class Documento {
	private ArrayList<Objeto> elementos;
	
	public Documento() {
		elementos = new ArrayList<Objeto>();
	}
	public int getQtdElementos() {
		return elementos.size();
	}
	public Objeto getElemento(int i) {
		return this.elementos.get(i);
	}
	public void adicionaElemento(Objeto obj) {
		elementos.add(obj);
	}
	public void removeElemento(Objeto obj) {
		elementos.remove(obj);
	}
}