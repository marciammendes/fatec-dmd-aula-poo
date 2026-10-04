package br.edu.sp.cps.fatec.barueri.dmd.poo;

public class Main {

	public static void main(String[] args) {
		Gato g1 = new Gato();
		Gato g2 = new Gato("nome","não sei",3,"Branco");
		Gato g3 = new Gato("Brita","Srd",4,"Escaminha");
		
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
		System.out.println();
		
		g1.miar();
		g2.miar();
		g3.miar();
		System.out.println();
		
		System.out.println(g1.nome);
		g1.nome = "Abacatinho";
		System.out.println(g1.nome);
		g1.miar();
		System.out.println();
		
		g1.VARIAVEL_GATO = "2";
		System.out.println(g2.VARIAVEL_GATO);
	}
	
	
}