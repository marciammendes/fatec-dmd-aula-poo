package aula4;

public class exemplo2 {
	public static void main (String[] args) {
		int[] valores = {1,2,3,5,7};
		int soma = soma(valores);
		System.out.println(soma);
	}
	
	private static int soma(int[] v) {
		int soma = 0;
		for(int i = 0; i < v.length; i++) {
			soma += v[i];
		}
		return soma;
	}
}
