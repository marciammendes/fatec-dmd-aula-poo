package aula5;

public class exerc01 {
	
	private static int somar (int[] p) {
		int soma = 0;
		for (int i = 0; i < p.length; i++) {
			soma += p[i];
		}
		return soma;
	}
	
	private static void imprimir (int[] p) {
		System.out.print("[");
		for (int i = 0; i < p.length; i++) {
			p[i] = i + 5;
			//System.out.println("[" + i + "] " + v[i]);
			System.out.print(p[i]);
			if (i < p.length - 1) {
			//System.out.print(", ");
			System.out.print(" + ");
			} 
		}
		System.out.print("]");
		//System.out.println("");
	}
	public static void main (String[] args) {
		int[] v;
		v = new int[6];		
		//int soma = 0;
		for (int i = 0; i < v.length; i++) {
			v[i] = i + 5;
			//soma += v[i];
			//System.out.println(soma);
		}
		imprimir(v);
		somar(v);
		int valor = somar(v);
		System.out.print("\n" + valor);
	}
}
