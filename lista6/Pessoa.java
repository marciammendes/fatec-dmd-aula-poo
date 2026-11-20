package lista6;

public class Pessoa {

	private String nome;
	private Pessoa pai;
	private Pessoa mae;
	
	//Construtores
	public Pessoa (String nome, Pessoa pai, Pessoa mae) {
		this.nome = nome;
		this.pai = pai;
		this.mae = mae;
	}
	
	public Pessoa (String nome) {
		this.nome = nome;
		this.pai = null;
		this.mae = null;
	}
	
	//Métodos de acesso
	public String getNome() {
		return nome;
		}
    public Pessoa getPai() {
    	return pai;
    	}
    public Pessoa getMae() {
    	return mae;
    	}
	
	//Igualdade semantica entre duas pessoas
	public boolean equals (Pessoa outra) {
		if (outra == null) {
			return false;
		}
		boolean nomesIguais = this.nome.equalsIgnoreCase(outra.getNome());
		boolean maesIguais = false;
		if (this.mae == null && outra.getMae() == null) {
			maesIguais = true;
		} else if (this.mae != null && outra.getMae() != null) {
			maesIguais = this.mae.equals(outra.getMae());
		}
		return nomesIguais && maesIguais;
	}
	
	//Verificar irmãos
	public boolean verificarIrmaos (Pessoa outra) {
		if (outra == null || this.equals(outra)) { 
	        return false;
	    }
		boolean mesmoPai = false;
	    boolean mesmaMae = false;
		if (this.pai != null && outra.getPai() != null) {
	        mesmoPai = this.pai.equals(outra.getPai());
	    }
		if (this.mae != null && outra.getMae() != null) {
	        mesmaMae = this.mae.equals(outra.getMae());
	    }
		return mesmoPai || mesmaMae;
	}
	
	//Verificar antecessor
	public boolean verificarAntecessor(Pessoa outra) {
	    if (outra == null) {
	        return false;
	    }

	    if (outra.equals(this.pai) || outra.equals(this.mae)) {
	        return true;
	    }

	    boolean antecessorPeloPai = false;
	    if (this.pai != null) {
	        antecessorPeloPai = this.pai.verificarAntecessor(outra);
	    }

	    boolean antecessorPelaMae = false;
	    if (this.mae != null) {
	        antecessorPelaMae = this.mae.verificarAntecessor(outra);
	    }

	    return antecessorPeloPai || antecessorPelaMae;
	}

	
	
}
