package aula2;

public class exercicio6TesteBreak {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println("Valor de i = " + i);
		}
	}
}

//COMENTÁRIOS:
//Para i igual a 1 e i menor que 10, somar de 1 em 1
//Porem, se i chegar em 5, a contagem para e imprime os valores de i