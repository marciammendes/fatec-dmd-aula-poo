package lista6;

public class Continente {

	private String name;
	private Pais[] paises;
	private int contadorPaises;
	
	//Construtor
	public Continente (String name) {
		this.name = name;
		System.out.println("Continente: " + name);
		this.paises = new Pais[48];
		contadorPaises = 0;
	}
	
	//Adicionar países ao continente
	public void addPais (Pais pais) {
		if(contadorPaises < paises.length) {
			paises[contadorPaises] = pais;
			contadorPaises++;
			System.out.println(pais + "adicionado");
		} else {
			System.out.println("Continente " + name + "atingiu o número máximo de países");
		}
	}
	
	public double getDimensaoTotal() {
		double dimensaoTotal = 0;
		for(int i = 0; i < contadorPaises; i++) {
			dimensaoTotal += paises[i].getDim();
		}
		return dimensaoTotal;
	}
	
	public double getPopulacaoTotal() {
		double popTotal = 0;
		for (int i = 0; i < contadorPaises; i++) {
			popTotal += paises[i].getPop();
		}
		return popTotal;
	}
	
	public double getDensidadeTotal() {
		double dimensao = getDimensaoTotal();
		if (dimensao == 0) {
			return 0;
		}
		return getPopulacaoTotal() / dimensao;
	}
	
	public Pais getMaiorPopulacao() {
		if (contadorPaises == 0) {
			return null;
		}
		Pais maior = paises[0];
		for (int i = 0; i < contadorPaises; i++) {
			if (paises[i].getPop() > maior.getPop()) {
				maior = paises[i];
			}
		}
		return maior;
	}
	
	public Pais getMenorPopulacao() {
		if (contadorPaises == 0) {
			return null;
		}
		Pais menor = paises[0];
		for (int i = 0; i < contadorPaises; i++) {
			if (paises[i].getPop() < menor.getPop()) {
				menor = paises[i];
			}
		}
		return menor;
	}
	
	public Pais getMaiorDimensao() {
		if (contadorPaises == 0) {
			return null;
		}
		Pais maior = paises[0];
		for (int i = 0; i < contadorPaises; i++) {
			if (paises[i].getDim() > maior.getDim()) {
				maior = paises[i];
			}
		}
		return maior;
	}
	
	public Pais getMenorDimensao() {
		if (contadorPaises == 0) {
			return null;
		}
		Pais menor = paises[0];
		for (int i = 0; i < contadorPaises; i++) {
			if (paises[i].getDim() < menor.getDim()) {
				menor = paises[i];
			}
		}
		return menor;
	}
	
	public double getRazaoTerritorial() {
		Pais menor = getMenorDimensao();
		Pais maior = getMaiorDimensao();
		if (menor == null || menor.getDim() == 0) {
			return 0;
		}
		return maior.getDim() / menor.getDim();
	}
}
