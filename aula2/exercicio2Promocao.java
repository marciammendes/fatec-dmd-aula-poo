package aula2;

public class exercicio2Promocao {
	public static void main(String[] args) {
		byte a = 10;
		short b = 21;
		int c = 32;
		long d = 43L;
		float e = 54.5F;
		double f = 65.4D;
		double result = (a * b / c * d / e * f);
		System.out.println(result);
	}
}

//COMENTARIOS
//byte: ocupa 1 byte (8 bits). Suporta valores de -128 a 127
//short: ocupa 2 bytes (16 bites). Suporta valores de -32.768 a 32.767
//int: ocupa 4 bytes (32 bits). Suporta valores de -2 bilhoes a 2 bilhoes
//long: ocupa 8 bytes (64 bits). L indica que deve ser tratado como um numero do tipo long
//float: ponto flutuante de precisao simples. Ocupa 4 bytes (32 bits) e oferece precisao de cerca de 6 a 7 casas decimais. F indica que é float
//double: ponto flutuante de precisao dupla. Pcupa 8 bytes (64 bits) e oferece precisao de cerca de 15 a 17 casas decimais. D indica que é double