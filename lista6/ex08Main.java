package lista6;

public class ex08Main {
	
	public static void main (String[] args) {
		
		Pais brasil = new Pais("BRA", "Brasil", 214211951, 8515767.049);
		Pais argentina = new Pais("ARG", "Argentina", 46060838, 2780400.0);
		Pais uruguai = new Pais("URY", "Uruguai", 3382537, 176215.0);
		
		Continente americaDoSul = new Continente("América do Sul");
		System.out.println();
		
		americaDoSul.addPais(brasil);
		americaDoSul.addPais(argentina);
		americaDoSul.addPais(uruguai);
		System.out.println();
		
		double dimensaoTotal = americaDoSul.getDimensaoTotal();
        double populacaoTotal = americaDoSul.getPopulacaoTotal();
        double densidadePopulacional = americaDoSul.getDensidadeTotal();
        double razaoTerritorial = americaDoSul.getRazaoTerritorial();
        
        System.out.println("AMÉRICA DO SUL");
        System.out.printf("Dimensão total do continente: %,.2f km²", dimensaoTotal);
        System.out.printf("\nPopulação total: %,.0f habitantes", populacaoTotal);
        System.out.printf("\nDensidade populacional: %.2f hab/km²", densidadePopulacional);
        System.out.println("\nPaís com maior população: " + americaDoSul.getMaiorPopulacao().getNome());
        System.out.println("Pais com menor população: " + americaDoSul.getMenorPopulacao().getNome());
        System.out.println("País com maior dimensão: " + americaDoSul.getMaiorDimensao().getNome());
        System.out.println("Pais com menor dimensão: " + americaDoSul.getMenorDimensao().getNome());
        System.out.printf("Razão territorial do maior país em relação ao menor país: %.2f", razaoTerritorial);
        System.out.printf("\n(1 %s para cada %.2f %ss)\n", americaDoSul.getMaiorDimensao().getNome(), 
        	    razaoTerritorial, americaDoSul.getMenorDimensao().getNome());
	}
}
