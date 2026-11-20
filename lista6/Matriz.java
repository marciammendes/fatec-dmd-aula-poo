package lista6;

public class Matriz {
	
	private int[][] matriz;
	private int linhas;
	private int colunas;
	
	public Matriz (int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.matriz = new int [linhas][colunas];
	}
	
	public void setElemento(int linha, int coluna, int valor) {
        this.matriz[linha][coluna] = valor;
    }

    public double getElemento(int linha, int coluna) {
        return this.matriz[linha][coluna];
    }

    public int getLinhas() {
    	return this.linhas;
    	}
    public int getColunas() {
    	return this.colunas;
    	}
    
    public void imprimir() {
        for (int i = 0; i < linhas; i++) {
            System.out.print("[ ");
            for (int j = 0; j < colunas; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println("]");
        }
    }
    
    public boolean equals(Matriz outra) {
        if (outra == null) {
        	return false;
        	}
        if (this.linhas != outra.getLinhas() || this.colunas != outra.getColunas()) {
            return false;
        }
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (this.matriz[i][j] != outra.getElemento(i, j)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public Matriz getTransposta() {
        Matriz transposta = new Matriz(this.colunas, this.linhas);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta.setElemento(j, i, this.matriz[i][j]);
            }
        }
        return transposta;
    }
    
    public Matriz getOposta() {
        Matriz oposta = new Matriz(this.linhas, this.colunas);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                oposta.setElemento(i, j, this.matriz[i][j] * -1);
            }
        }
        return oposta;
    }
    
    public Matriz matrizNula() {
        return new Matriz(this.linhas, this.colunas);
    }
    
    public boolean verificarIdentidade() {
        if (this.linhas != this.colunas) {
            return false;
        }
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i == j) {
                    if (this.matriz[i][j] != 1) {
                        return false;
                    }
                } else {
                    if (this.matriz[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public boolean verificarDiagonal() {
        if (this.linhas != this.colunas) {
            return false;
        }
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i != j) {
                    if (this.matriz[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public boolean verificarSingular() {
        if (this.linhas != this.colunas) {
            return false;
        }
        if (!verificarDiagonal()) {
        	return false;
        }

        double primeiroElemento = this.matriz[0][0];
        for (int i = 1; i < linhas; i++) {
            if (this.matriz[i][i] != primeiroElemento) {
                return false;
            }
        }
        return true;
    }
    
    public boolean verificarSimetria() {
        if (this.linhas != this.colunas) {
            return false;
        }
        return this.equals(this.getTransposta());
    }
    
    public boolean VerificarAntiSimetria() {
        if (this.linhas != this.colunas) {
            return false;
        }
        Matriz oposta = this.getOposta();
        Matriz transposta = this.getTransposta();
        return oposta.equals(transposta);
    }
    
    public void somarMatrizes(Matriz outra) {
        if (this.linhas != outra.getLinhas() || this.colunas != outra.getColunas()) {
            System.out.println("Erro: As matrizes possuem dimensões diferentes e não podem ser somadas.");
            return; 
        }
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                this.matriz[i][j] += outra.getElemento(i, j);
            }
        }
    }
    
    public void subtrairMatrizes(Matriz outra) {
        if (this.linhas != outra.getLinhas() || this.colunas != outra.getColunas()) {
            System.out.println("Erro: As matrizes possuem dimensões diferentes e não podem ser subtraídas.");
            return;
        }
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                this.matriz[i][j] -= outra.getElemento(i, j);
            }
        }
    }
    
    public void multiplicarMatrizes(Matriz outra) {
        if (this.colunas != outra.getLinhas()) {
            System.out.println("Erro: O número de colunas da primeira matriz deve ser igual ao número de linhas da segunda.");
            return;
        }
        int[][] resultado = new int[this.linhas][outra.getColunas()];
        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < outra.getColunas(); j++) {
                for (int k = 0; k < this.colunas; k++) {
                    resultado[i][j] += this.matriz[i][k] * outra.getElemento(k, j);
                }
            }
        }
        this.colunas = outra.getColunas();
        this.matriz = resultado;
    }
    
    public Matriz copiarMatriz() {
        Matriz copia = new Matriz(this.linhas, this.colunas);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                copia.setElemento(i, j, this.matriz[i][j]);
            }
        }
        return copia;
    }
}
