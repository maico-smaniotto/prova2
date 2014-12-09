class OrganizaConteudo {
    public static void removeRotacoes(Objeto[] elementos) {
		for (int i = 0; i < elementos.length; i++) {
			if (elementos[i] instanceof Rotacionavel){
				((Rotacionavel)elementos[i]).setAnguloRotacao(0);
			}
		}
    }
    public static void economizaTamanho(Objeto[] elementos) {
        for (int i = 0; i < elementos.length; i++) {
			if (elementos[i] instanceof Redimensionavel){
				((Redimensionavel)elementos[i]).setDimensoes(200, 200);
			}
		}
    }
}
