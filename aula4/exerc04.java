package aula6;

import java.util.Arrays;

public class exerc04 {
    public static void main(String[] args) {
        // 1. Especifica a quantidade de linhas (ex: 5 linhas)
        int[][] matriz = new int[8][]; 
        int valor = 1;
        
        for (int i = 0; i < matriz.length; i++) {
        	int elementos = i;
            matriz[i] = new int[elementos];
            
            for (int j = 0; j < elementos; j++) {
                matriz[i][j] = valor++;
            }
        }

        for (int[] linha : matriz) {
            System.out.println(Arrays.toString(linha));
        }
    }
}