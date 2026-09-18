package aula2;

public class exercicio5TesteFor {
	public static void main(String[] args) {
		boolean condicao = false;
		for (; !condicao;) {
			System.out.println(condicao);
			condicao = true;
			System.out.println(condicao);
		}
	}
}

//COMENTARIOS:
//Foi criada a variavel booblena 'condicao' com valor false
//laço for (inicializção, condição, incremento)
