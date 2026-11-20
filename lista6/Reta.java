package lista6;

public class Reta {
	
	private double a, b;
	
	//Construindo reta a partir de dois valores (y = ax + b)
	public Reta (double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	//Construindo reta a partir de dois pontos (y - ya = m(x-xa)) -> equação fundamental da reta
	public Reta (Ponto2D p1, Ponto2D p2) {
		double x1 = p1.getX();
		double x2 = p1.getY();
		double y1 = p2.getX();
		double y2 = p2.getY();
		
		this.a = (y2 - y1) / (x2 - x1);
		this.b = y1 - (a * x1);
	}
	
	//Métodos de acesso para a e b
	public double getA() { 
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    //Método de verificação se um ponto pertence a reta
    public boolean pertence2(Ponto2D ponto) {
        if (ponto == null) {
            return false;
        }
        
        double pontoVerificado = (this.a * ponto.getX()) + this.b;
        return ponto.getY() == pontoVerificado;
    }
    
    public boolean pertence(Ponto2D ponto) {
    	if (ponto == null) {
            return false;
        }
    	double x0 = ponto.getX();
    	double y0 = ponto.getY();
    	
    	double numerador = (this.a * x0) - y0 + this.b;
    	if (numerador < 0) {
    		numerador = numerador * (-1);
    	}
    	
    	double denominador = Math.sqrt((this.a * this.a) + 1);
    	
    	double d = numerador / denominador;
    	return d == 0;
    }
    
    //Representação em texto
    public String toString() {
        return String.format("y = %.0fx + %.0f", this.a , this.b);
    }
    
    //Cálculo da intersecção entre duas retas
    public Ponto2D interseccao (Reta outra) {
    	if (outra == null) {
    		return null;
    	}
    	
    	if(this.a == outra.a) {
    		return null;
    	}
    	double interX = (outra.getB() - this.b) / (this.a - outra.getA());
    	double interY = (this.a * interX) + this.b;
    	return new Ponto2D (interX, interY);
    }
}
