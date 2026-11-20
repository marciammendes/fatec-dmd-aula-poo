package lista6;

public class Ponto2D {
	
	private double x, y;
	
	//Construtores
	public Ponto2D() {//por default
		this.x = 0;
		this.y = 0;
	}
	
	public Ponto2D(double x, double y) {//local indicado por dois parametros do tipo double
		this.x = x;
		this.y = y;
	}
	
	public Ponto2D(Ponto2D outroPonto) {//local indicado por outro ponto
		if (outroPonto != null) {
			this.x = outroPonto.x;
			this.y = outroPonto.y;
		}
	}
	
	//Métodos de acesso
	//LEMBRETE: getter devolve e setter insere (pq criamos os valores como private, entao da acesso controlado)
	public double getX() { 
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    //Movimentação do ponto (mesmo parâmetro dos construtores)
    public void mover() {
    	this.x = 0;
    	this.y =  0;
    }
    
    public void mover(int x, int y) {
    	this.x = x;
    	this.y = y;
    }
    
    public void mover(Ponto2D outroPonto) {
    	if (outroPonto != null) {
    		this.x = outroPonto.x;
    		this.y = outroPonto.y;
    	}
    }
    
    //Comparação semântica
    public boolean equals(Ponto2D comparar) {
        if (comparar == null) {
            return false;
        }
        
        if (this.x == comparar.x && this.y == comparar.y) {
            return true;
        } else {
            return false;
        }
    }
    
    //Representação do objeto
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
    
    //Calcular distância
    //dab = sqrt ((xb-xa)^2 + (yb-ya)^2)
    public double calcularDistancia(Ponto2D outroPonto) {
        double difX = outroPonto.x - this.x;
        double difY = outroPonto.y - this.y;
        double quadradoX = difX * difX;
        double quadradoY = difY * difY;
        double sqrt = Math.sqrt(quadradoX + quadradoY);
        return sqrt;
    }

    //Criação de um novo ponto (clone)
    public Ponto2D clone() {
        Ponto2D novoPonto = new Ponto2D(x, y);
        return novoPonto;
    }
}
