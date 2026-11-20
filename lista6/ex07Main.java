package lista6;

public class ex07Main {
	
	public static void main(String[] args) {
		
		Pais brasil = new Pais("BRA", "Brasil", 214211951, 8515767.049);
		Pais argentina = new Pais("ARG", "Argentina", 46060838, 2780400.0);
		Pais uruguai = new Pais("URY", "Uruguai", 3382537, 176215.0);
		
		brasil.setPop(214211951);
		System.out.println(brasil.toString());
		System.out.println();
		
		brasil.adicionarVizinho(argentina);
		brasil.adicionarVizinho(uruguai);
		argentina.adicionarVizinho(brasil);
		argentina.adicionarVizinho(uruguai);
		
		System.out.print("Os objetos comparados representam o mesmo país? ");
		if (brasil.equals(argentina)) {
			System.out.println("Sim");
		} else {
			System.out.println("Não");
		}
		
		System.out.print("Os países analisados são limítrofes? ");
		if (brasil.fronteira(argentina)) {
			System.out.println("Sim");
		} else {
			System.out.println("Não");
		}
		System.out.println();
		
		System.out.printf("Densidade demográfica do Brasil: %.2f hab/km²\n", brasil.calcularDensidade());
		System.out.println();
		
		Pais[] comuns = brasil.vizinhosComuns(argentina);
        if (comuns.length == 0) {
            System.out.println("Brasil e Argentina não possuem vizinhos em comum.");
        } else {
            for (int i = 0; i < comuns.length; i++) {
                System.out.println("Vizinho em comum encontrado: " + comuns[i].getNome());
            }
        }
	}
}
