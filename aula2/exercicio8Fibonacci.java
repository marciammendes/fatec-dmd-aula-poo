package aula2;

public class exercicio8Fibonacci {
	public static void main(String[] args) {
		int n1 = 0; //Fn - 2 (dois termos atras)
		int n2 = 1; //Fn - 1 (um termo atras)
		
		System.out.println("30 primeiros números da sequência de Fibonacci: ");
		
		for (int i = 1; i <= 30; i++) {
			System.out.print(n1 + (i < 30 ? ", " : "\n"));
		
			int sequencia = n1 + n2;
			n1 = n2;
			n2 = sequencia;
		}
	}
}

//COMENTARIOS:
//Regra: Fn = Fn -1 + Fn -2 (o termo atual é a soma dos dois termos anteriores)
//Lembrar que é uma fila: Mostra o n1, calcula a sequencia, e faz a fila andar transformando n2 em n1, e n1 no resultado da sequencia
//int suporta ate 2 bilhoes (4 bits), entao se desse errado eu devia ter usado long
//no for o operador ternario vai avaliar a condicao i <30 e dizer se vai continuar printando resultado ou nao