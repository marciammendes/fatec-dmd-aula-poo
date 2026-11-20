package lista6;

public class ex02Main {
	public static void main(String[] args) {
	        
		Ponto2D p1 = new Ponto2D();
	    Ponto2D p2 = new Ponto2D(3, 4);
	        
	    System.out.println("Ponto 1 (p1): " + p1.toString());
	    System.out.println("Ponto 2 (p2): " + p2.toString());
	        
	    double distancia = p1.calcularDistancia(p2);
	    System.out.println("A distância entre p1 e p2 é: " + distancia);
	        
	    Ponto2D p3 = p2.clone();
	    if (p3 == p1.clone()) {
	    	System.out.println("\nPonto 3 foi clonado do Ponto 1");
	    	System.out.println("\nPonto 3: " + p3.toString());
	    }   if (p3 == p2.clone()) {
	    	System.out.println("\nPonto 3 foi clonado do Ponto 2");
	    	System.out.println("\nPonto 3: " + p3.toString());
	    } 
	    
	        
	    boolean compararPontos = p1.equals(p2);
	    if (compararPontos == false) {
	    	System.out.println("\np1 é diferente de p2");
	    } if (compararPontos == true) {
	    	System.out.println("\np1 é igual a p2");
	    }
	        
	    boolean compararClone = p2.equals(p3);
	    if (compararClone == false) {
	    	System.out.println("p2 é diferente de p3");
	    } if (compararClone == true) {
	    	System.out.println("p2 é igual a p3");
	    }
	        
	    p2.mover(0, 0);
	    System.out.println("\nNova posição do p2: " + p2.toString());
	        
	    boolean novaComparacao = p1.equals(p2);
	    
	    if (novaComparacao == false) {
	    	System.out.println("p1 é diferente de p2");
	    } if (compararClone == true) {
	    	System.out.println("p1 é igual a p2");
	    }    
	}
}
