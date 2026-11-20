package lista6;

public class NumeroComplexo {
	
	private double real, imag;
	
	//Construtor
	public NumeroComplexo(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	//Métodos de acesso
	public double getReal() {
		return real;
	}
	
	public void setReal(double real) {
		this.real = real;
	}
	
	public double getImag() {
		return imag;
	}
	
	public void setImag(double imag) {
		this.imag = imag;
	}
	
	//Operações com os números complexos
	//OBS: quando o numero acompanha i, ele é imaginario
	
	//SOMA: (a+bi) + (c+di) = (a+c) + (b+d)i
	public void somar (NumeroComplexo outro) {
		this.real = this.real + outro.real;
        this.imag = this.imag + outro.imag;
	}
	
	//SUBTRAÇÃO: (a+bi) - (c+di) = (a+c) - (b+d)i
	public void subtrair (NumeroComplexo outro) {
		this.real = this.real - outro.real;
	    this.imag = this.imag - outro.imag;
	}
		
	//MULTIPLICAÇÃO: (a+bi) * (c+di) = (ac - bd) + (ad + bc)i
	public void multiplicar (NumeroComplexo outro) {
		double realAnterior = this.real;
		this.real = (realAnterior * outro.real) - (this.imag * outro.imag);
	    this.imag = (realAnterior * outro.imag) + (this.imag * outro.real);
	}
	
	//DIVISÃO: (a+bi) / (c+di) = [(ac+bd)/(c²+d²)] + [(bc-ad)/(c²+d²)]i
	public void dividir (NumeroComplexo outro) {
		double realAnterior = this.real;		
		double denominador = (outro.real * outro.real) + (outro.imag * outro.imag);
		if (denominador == 0) {
			System.out.println("Não é possível fazer divisão por zero");
		} else {
			this.real = ((realAnterior * outro.real) + (this.imag * outro.imag)) / denominador;
	        this.imag = ((this.imag * outro.real) - (realAnterior * outro.imag)) / denominador;
		}
    }
	
	//Comparação semântica
	public boolean equals(NumeroComplexo outro) {
        if (outro == null) {
            return false;
        }
        
        if (this.real == outro.getReal() && this.imag == outro.getImag()) {
            return true;
        } else {
            return false;
        }
    }
	
	//Representação do objeto
	public String toString() {
		return real + " + " + imag + "i";
	}
	
	//Cálculo do módulo
	//|z| = sqrt (a^2 + b^2)
	public double calcularModulo() {
		double somaQuadrados = (real * real) + (imag * imag);
		double sqrt = Math.sqrt(somaQuadrados);
		return sqrt;
	}
}
