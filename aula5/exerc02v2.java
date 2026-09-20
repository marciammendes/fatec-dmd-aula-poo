package aula5;

public class exerc02v2 {
	public static void main (String[] args) {
		int [][] sala = new int [7][6];
		sala[0][0] = 1;
		System.out.println("Aluno na posição [0][0] já está definido como presente.\n");
		int pessoasPresentes = 0;
		
		sala[0][3] = 1; sala[0][4] = 1; sala[0][5] = 1;
		sala[1][0] = 1; sala[1][1] = 1;
		sala[2][0] = 1; sala[2][5] = 1;
		sala[3][3] = 1; sala[3][4] = 1;
		sala[4][1] = 1; sala[4][2] = 1; sala[4][3] = 1; sala[4][4] = 1; sala[4][5] = 1;
		sala[5][1] = 1; sala[5][2] = 1; sala[5][3] = 1; sala[5][4] = 1;
		sala[6][2] = 1; sala[6][3] = 1; sala[6][4] = 1; sala[6][5] = 1;
		
		for (int i = 0; i < sala.length; i++) {
			for (int j = 0; j < sala[i].length; j++) {
				pessoasPresentes += sala[i][j];
				System.out.print(sala[i][j] + " ");
				}
			System.out.println();
		}
		System.out.println("\nSão " +  pessoasPresentes + " pessoas presentes.");
    }
}
