package lista6;

public class ex01Main {
	public static void main(String[] args) {
		Contador contador = new Contador();
	    
	    contador.incrementar();
	    contador.incrementar();
	    System.out.println("Valor atual: " + contador.retornarValor());
	        
	    contador.zerar();
	    System.out.println("\nREINICIANDO CONTADOR...");
	    System.out.println("Valor inicial: " + contador.retornarValor());
	}
}
