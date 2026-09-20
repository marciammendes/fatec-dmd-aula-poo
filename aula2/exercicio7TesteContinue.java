package aula2;

public class exercicio7TesteContinue {
	public static void main(String[] args) {
		int i = 1;
		while (i < 5) {
			//i++;
			if (i == 4) {
				continue;
			}
			System.out.println("Valor de i = " + i);
		}
	}
}

//COMENTARIOS:
//O contador inicia com o valor 1, e o laco roda enquanto i < 5
//Como não foi incrementado i++ no while antes do if, o laco continua repetindo
//Se corrigir o codigo, ele nao imprime o 4 porque pula o resto do codigo
