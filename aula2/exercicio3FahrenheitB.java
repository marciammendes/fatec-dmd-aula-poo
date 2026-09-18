package aula2;

import java.util.Scanner;

public class exercicio3FahrenheitB {
	
	private static Scanner scanner = new Scanner(System.in); //detectar o que o jogador digita no console
    private static double f;
    
	public static void main(String[] args) {
		System.out.println("Temperatura (°F): ");
		f = scanner.nextDouble();
		double CDouble = (f - 32.0) * (5.0 / 9.0);
		System.out.println("a) Temperatura (°C) = " + CDouble);
		int CInt = (int) (f - 32) * 5 / 9;
		System.out.println("b) Temperatura (°C) = " + CInt);
	}
}
