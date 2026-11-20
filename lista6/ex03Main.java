package lista6;

public class ex03Main {
	
	public static void main (String[] args) {
		NumeroComplexo ncomplex = new NumeroComplexo(9,8);
		System.out.println("n1: " + ncomplex.toString());
		
		NumeroComplexo outroComplex = new NumeroComplexo(1,2);
		System.out.println("n2: " + outroComplex.toString());
		
		NumeroComplexo soma = new NumeroComplexo(ncomplex.getReal(), ncomplex.getImag());
		soma.somar(outroComplex);
		System.out.println("\nSoma = " + soma.toString());
		
		NumeroComplexo subtracao = new NumeroComplexo(ncomplex.getReal(), ncomplex.getImag());
		subtracao.subtrair(outroComplex);
		System.out.println("Subtração = " + subtracao.toString());

		NumeroComplexo multiplicacao = new NumeroComplexo(ncomplex.getReal(), ncomplex.getImag());
		multiplicacao.multiplicar(outroComplex);
		System.out.println("Multiplicação = " + multiplicacao.toString());
		
		NumeroComplexo divisao = new NumeroComplexo(ncomplex.getReal(), ncomplex.getImag());
		divisao.dividir(outroComplex);
		//System.out.println("Divisão = " + divisao.toString());
		System.out.printf("Divisão = %.2f + %.2fi", divisao.getReal(), divisao.getImag());
		
		System.out.print("\n\nOs números complexos são iguais? ");
		if (outroComplex == ncomplex) {
			System.out.println("Sim");
		} else {
			System.out.println("Não");
		}
		
		//| z | = (3 2 + 4 2 ) 1/2 = (9 + 16) 1/2 = 5
		System.out.printf("\nMódulo de n1: |z| = ( %.0f² + %.0f²) = (%.0f + %.0f) = %.0f", 
				ncomplex.getReal(), ncomplex.getImag(), 
				(ncomplex.getReal() * ncomplex.getReal()), (ncomplex.getImag() * ncomplex.getImag()), 
				ncomplex.calcularModulo());
		System.out.printf("\nMódulo de n2: |z| = ( %.0f² + %.0f²) = (%.0f + %.0f) = %.0f", 
				outroComplex.getReal(), outroComplex.getImag(), 
				(outroComplex.getReal() * outroComplex.getReal()), (outroComplex.getImag() * outroComplex.getImag()), 
				outroComplex.calcularModulo());
	}
}
