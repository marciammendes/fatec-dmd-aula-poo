package br.edu.sp.cps.fatec.barueri.dmd.poo;

public class Gato {
	
	static String VARIAVEL_GATO = "1";
	//atributos
	String nome;
	String raca;
	int quantidadePatas;
	String cor;
	
	public Gato() {
		// TODO Auto-generated method stub
	}
	
	public Gato (String n, String r, int qtdePatas, String c) {
		nome = n;
		raca = r;
		quantidadePatas = qtdePatas;
		cor = c;
	}
	
	public void miar() {
		System.out.println(nome + ": " + "MIAAAUUUUUU");
	}
}
