class TesteEstilo {
	public static void main(String[] args) {
		Palavra p1 = new Palavra("teste");
		Palavra p2 = new Palavra("1");
		Figura f = new Figura();
		GerenciadorEstilo g = new GerenciadorEstilo();
		try {
			g.aplicaEstilo(p1, "negrito");
			// g.aplicaEstilo(f, "italico");
			// g.aplicaEstilo(p2, "sublinhado");
		} catch (EElementoIncompativel e) {
			System.out.println("Elemento incompatível");
		} catch (EPalavraPequena e) {
			System.out.println("Palavra pequena");
		}
	}
}