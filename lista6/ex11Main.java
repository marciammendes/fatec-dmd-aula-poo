package lista6;

public class ex11Main {
	
	public static void main(String[] args) {
		
		Matriz m1 = new Matriz(2, 2);
		m1.setElemento(0, 0, 2); m1.setElemento(0, 1, 3);
		m1.setElemento(1, 0, 4); m1.setElemento(1, 1, 5);

		Matriz m2 = new Matriz(2, 2);
		m2.setElemento(0, 0, 1); m2.setElemento(0, 1, 0);
		m2.setElemento(1, 0, 0); m2.setElemento(1, 1, 1);

		Matriz m3 = new Matriz(2, 2);
		m3.setElemento(0, 0, 4); m3.setElemento(0, 1, 0);
		m3.setElemento(1, 0, 0); m3.setElemento(1, 1, 4);

		System.out.println("Matriz M1:");
		m1.imprimir();
		System.out.println("Matriz M2:");
		m2.imprimir();
		System.out.println("Matriz M3:");
		m3.imprimir();
		System.out.println();

		System.out.println("M2 é Identidade? " + (m2.verificarIdentidade() ? "Sim" : "Não"));
		System.out.println("M3 é Diagonal? " + (m3.verificarDiagonal() ? "Sim" : "Não"));
		System.out.println("M3 é Singular? " + (m3.verificarSingular() ? "Sim" : "Não"));
		System.out.println("M1 é Simétrica? " + (m1.verificarSimetria() ? "Sim" : "Não"));
		System.out.println();

		System.out.println("Transposta de M1:");
		Matriz m1Transposta = m1.getTransposta();
		m1Transposta.imprimir();

		System.out.println("Oposta de M1:");
		Matriz m1Oposta = m1.getOposta();
		m1Oposta.imprimir();
		System.out.println();

		Matriz m1Copia = m1.copiarMatriz();

		System.out.println("Somando M2 em M1 (M1 + M2):");
		m1Copia.somarMatrizes(m2);
		m1Copia.imprimir();

		System.out.println("Subtraindo M2 de M1 de volta:");
		m1Copia.subtrairMatrizes(m2);
		m1Copia.imprimir();

		System.out.println("Multiplicando M1 por M3 (M1 * M3):");
		m1Copia.multiplicarMatrizes(m3);
		m1Copia.imprimir();
	}
}
