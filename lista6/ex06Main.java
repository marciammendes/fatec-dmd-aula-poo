package lista6;
import java.util.Scanner;

public class ex06Main {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		Circulo c1 = new Circulo(5);
		System.out.println(c1.toString());
		System.out.printf("Área do círculo inicial: %.2f", c1.calcularArea());
		System.out.println();
		
		c1.inflar();
		System.out.println("\nCírculo atualizado (+1 unid): " + c1.toString());
		c1.desinflar();
		System.out.println("Círculo atualizado (-1 unid): " + c1.toString());
		System.out.println();
		c1.inflar(4);
		System.out.println("Círculo atualizado (+4 unids): " + c1.toString());
		c1.calcularArea();
        System.out.printf("Área do círculo atualizada: %.2f\n", c1.calcularArea());
		c1.desinflar(4);
		System.out.println("Círculo atualizado (-4 unids): " + c1.toString());
        System.out.println();
		
		c1.mover(2,3);
        System.out.println("Após mover por coordenadas: " + c1.toString());
        Ponto2D outroPonto = new Ponto2D(5, 6);
        c1.mover(outroPonto);
        System.out.println("Após mover para outro ponto: " + c1.toString());
        c1.mover();
        System.out.println("Após mover por default: " + c1.toString());
	}
}
