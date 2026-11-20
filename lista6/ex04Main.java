package lista6;

public class ex04Main {

	public static void main(String[] args) {
        
        Ponto2D p1 = new Ponto2D(5, 3);
        Ponto2D p2 = new Ponto2D(2, 7);
        
        Reta r1 = new Reta(p1, p2);
        Reta r2 = new Reta(2, 6); 

        System.out.println("Equação da Reta 1: " + r1.toString());
        System.out.println("Equação da Reta 2: " + r2.toString());
        System.out.println();

        System.out.print("O ponto " + p1 + " pertence à Reta 1? ");
        if (r1.pertence(p1)) {
        	System.out.print("Sim\n");
        } else {
        	System.out.print("Não\n");
        }
        
        Ponto2D p3 = new Ponto2D(1, 8);
        System.out.print("O ponto " + p3 + " pertence à Reta 1? ");
        if (r1.pertence2(p3)) {
        	System.out.print("Sim\n");
        } else {
        	System.out.print("Não\n");
        }

        Ponto2D pontoCruzamento = r1.interseccao(r2);
        if (pontoCruzamento != null) {
        	System.out.printf("As retas se cruzam no ponto: (%.2f , %.2f)\n", pontoCruzamento.getX(), pontoCruzamento.getY());
        } else {
            System.out.println("As retas são paralelas (não possuem ponto de interseção)\n");
        }
        System.out.println();

        Reta r3 = new Reta(r1.getA(), 15);
        System.out.println("Reta 3: " + r3.toString());
        
        Ponto2D cruzamentoParalelo = r1.interseccao(r3);
        if (cruzamentoParalelo == null) {
            System.out.println("Reta 1 e Reta 3 são paralelas");
        }
    }
}
