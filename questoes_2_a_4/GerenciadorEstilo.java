class GerenciadorEstilo {
	public void aplicaEstilo(Objeto obj, String estilo) throws EElementoIncompativel, EPalavraPequena {
		if (!(obj instanceof Palavra)) {
			throw new EElementoIncompativel();
		} else if (((Palavra)obj).getTexto().length() < 2) {
			throw new EPalavraPequena();
		} 
		Palavra p = (Palavra)obj;
		if (estilo.equals("negrito")) {
			p.setNegrito(true);
		} else if (estilo.equals("italico")) {
			p.setItalico(true);
		} else if (estilo.equals("sublinhado")) {
			p.setSublinhado(true);
		}
	}
}