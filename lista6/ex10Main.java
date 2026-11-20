package lista6;

public class ex10Main {
	
	public static void main(String[] args) {
        
        Conjunto conjuntoA = new Conjunto();
        conjuntoA.adicionar("Marcia");
        conjuntoA.adicionar("Julia");
        conjuntoA.adicionar("Andriele");
        conjuntoA.adicionar("Gustavo");
        conjuntoA.adicionar("Julia");

        Conjunto conjuntoB = new Conjunto();
        conjuntoB.adicionar("Walisson");
        conjuntoB.adicionar("Pedro");
        conjuntoB.adicionar("Lucas");
        conjuntoB.adicionar("Gustavo");
        
        System.out.print("Conjunto A: ");
        conjuntoA.imprimir();
        
        System.out.print("Conjunto B: ");
        conjuntoB.imprimir();
        System.out.println();

        System.out.print("União (A + B): ");
        Conjunto resultadoUniao = conjuntoA.uniao(conjuntoB);
        resultadoUniao.imprimir();

        System.out.print("Interseção (A ∩ B): ");
        Conjunto resultadoInter = conjuntoA.inter(conjuntoB);
        resultadoInter.imprimir();

        System.out.print("Subtração (A - B): ");
        Conjunto resultadoMenos = conjuntoA.menos(conjuntoB);
        resultadoMenos.imprimir();
    }
}
