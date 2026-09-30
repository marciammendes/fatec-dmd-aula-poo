package aula4;

public class exemplo1 {
	public static void main (String[] args) {
		int soma = soma();
		System.out.println(soma);
	}
	
	private static int soma() {
		int soma = 0;
		int[]n = {1,2,3,5,7};
		for(int i = 0; i < n.length; i++) {
			soma += n[i];
		}
		return soma;
	}
}

//array é uma variável do tipo referência
//grifar e ctrl + i - refatorar (?)
//alt + shift + r - renomear