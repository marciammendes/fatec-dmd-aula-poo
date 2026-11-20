package lista6;

public class Circulo {
	
	private double raio;
	private Ponto2D centro;

	//Construtores
	public Circulo(double raio, Ponto2D centro) {
		this.raio = raio;
		this.centro = centro;
	}
	
	public Circulo (double raio) {
		this.raio = raio;
		this.centro = new Ponto2D();
	}
	
	//Método de acesso
	public double getRaio() {
	    return this.raio;
	}

	public void setRaio(double raio) {
	    if (raio > 0) {
	        this.raio = raio;
	    }
	}
	
	//Inflar e desinflar
	public void inflar (double valor) {
		this.raio = this.raio + valor;
	}
	
	public void desinflar(double valor) {
		if (this.raio - valor > 0) {
			this.raio = this.raio - valor;
		} else {
			System.out.println("Erro: O raio não pode ser igual ou menor a zero");
		}
	}
	
	//Inflar e desinflar (uma unidade)
	public void inflar() {
		this.raio = this.raio + 1;
	}
		
	public void desinflar() {
		if (this.raio - 1 > 0) {
			this.raio = this.raio - 1;
		} else {
			System.out.println("Erro: O raio não pode ser igual ou menor a zero");
		}
	}
		
	//Mover o círculo
	public void mover() {
		this.centro.setX(0);
		this.centro.setY(0);
	}
	
	public void mover(double novoX, double novoY) {
		this.centro.setX(novoX);
		this.centro.setY(novoY);
	}
	
	public void mover(Ponto2D novoCentro) {
        if (novoCentro != null) {
            this.centro.setX(novoCentro.getX());
            this.centro.setY(novoCentro.getY());
        }
    }
	
	//Área do círculo
	public double calcularArea() {
		return (3.141 * (this.raio * this.raio));
		//return Math.PI * Math.pow(this.raio, 2);
	}
	
	public String toString() {
        return String.format("Raio: %.2f | Ponto central: %s", this.raio, this.centro.toString());
    }
}
