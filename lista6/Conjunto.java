package lista6;

public class Conjunto {

	private String[] elementos;
	private int qtdElementos;
	
	public Conjunto() {
		this.elementos = new String[2];
		this.qtdElementos = 0;
	}
	
    public boolean pertence(String elemento) {
        if (elemento == null) { return false; }
        for (int i = 0; i < qtdElementos; i++) {
            if (this.elementos[i].equalsIgnoreCase(elemento)) {
                return true;
            }
        }
        return false;
    }

    public void adicionar(String elemento) {
        if (elemento == null || pertence(elemento)) {
            return;
        }
        if (qtdElementos == elementos.length) {
            String[] novoArray = new String[elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                novoArray[i] = elementos[i];
            }
            this.elementos = novoArray;
        }
        this.elementos[qtdElementos] = elemento;
        qtdElementos++;
    }
    
    public Conjunto uniao(Conjunto outro) {
        Conjunto novoConjunto = new Conjunto();
        for (int i = 0; i < this.qtdElementos; i++) {
            novoConjunto.adicionar(this.elementos[i]);
        }
        if (outro != null) {
            for (int i = 0; i < outro.qtdElementos; i++) {
                novoConjunto.adicionar(outro.elementos[i]);
            }
        }
        return novoConjunto;
    }
    
    public Conjunto inter(Conjunto outro) {
        Conjunto novoConjunto = new Conjunto();
        if (outro == null) { return novoConjunto; }

        for (int i = 0; i < this.qtdElementos; i++) {
            if (outro.pertence(this.elementos[i])) {
                novoConjunto.adicionar(this.elementos[i]);
            }
        }
        return novoConjunto;
    }
    
    public Conjunto menos(Conjunto outro) {
        Conjunto novoConjunto = new Conjunto();
        for (int i = 0; i < this.qtdElementos; i++) {
            if (outro == null || !outro.pertence(this.elementos[i])) {
                novoConjunto.adicionar(this.elementos[i]);
            }
        }
        return novoConjunto;
    }

    public void imprimir() {
        System.out.print("[ ");
        for (int i = 0; i < qtdElementos; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println("]");
    }
}
