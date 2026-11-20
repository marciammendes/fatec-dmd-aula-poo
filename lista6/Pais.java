package lista6;

public class Pais {

	private String iso, nome;
	private double pop, dim;
	private Pais[] fronteiras = new Pais[40]; 
    private int qtdeFronteiras = 0;
	
    //Construtor
	public Pais (String iso, String nome, double pop, double dim){
		this.iso = iso;
		this.nome = nome;
		this.pop = pop;
		this.dim = dim;
	}
	
	//Métodos de acesso
	public String getIso() { return iso; }
	public void setIso(String iso) { this.iso = iso; }
	
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
	
	public double getPop() { return pop; }
	public void setPop(double pop) { this.pop = pop; }
	
	public double getDim() { return dim; }
	public void setDim(double dim) { this.dim = dim; }
	
	//Adicionar vizinhos
	public boolean adicionarVizinho(Pais vizinho) {
		if (vizinho == null || this.equals(vizinho) || fronteira(vizinho)) {
			return false; 
			}
		if (qtdeFronteiras < 40) {
			this.fronteiras[qtdeFronteiras] = vizinho;
			qtdeFronteiras++;
			return true;
			}
		return false;
	}
	
	//Comparação semântica
	public boolean equals(Pais outro) {
        if (outro == null) { return false; }
        return this.iso.equalsIgnoreCase(outro.getIso()); 
    }
	
	//Verificar país limítrofe
	public boolean fronteira(Pais outro) { 
		if (outro == null) { return false; }
		for (int i = 0; i < qtdeFronteiras; i++) {
			if (this.fronteiras[i].equals(outro)) {
			return true;
			}
		}
		return false;
	}
	
	//Cálculo densidade demográfica
	public double calcularDensidade() {
		if (this.dim == 0) { return 0; }
		return this.pop / this.dim;
	}
	
	//Array de vizinhos comuns aos dois países
	public Pais[] vizinhosComuns(Pais outro) {
		if (outro == null) { return new Pais[0]; }
		Pais [] comunsTemp = new Pais[40];
		int qtdeComuns = 0;
		
		for (int i = 0; i < this.qtdeFronteiras; i++) {
			if (outro.fronteira(this.fronteiras[i])) {
				comunsTemp[qtdeComuns] = this.fronteiras[i];
				qtdeComuns++;
			}
		}
		Pais[] resultadoFinal = new Pais[qtdeComuns];
		for (int i = 0; i < qtdeComuns; i++) {
			resultadoFinal[i] = comunsTemp[i];
		}
		return resultadoFinal;
	}
	
	//Representação
	public String toString() { 
		return String.format("ISO: %s | Nome: %s | População: %.0f habitantes | Dimensão: %.3f Km²", 
				getIso(), getNome(),getPop(), getDim());
	}
}
