package lista6;

public class ex09Main {
	
	public static void main(String[] args) {
		Pessoa avoPaterno = new Pessoa("José Carlos");
		Pessoa avoMaterna = new Pessoa("Maria");

	    Pessoa pai = new Pessoa("Northon", avoPaterno, null);
	    Pessoa mae = new Pessoa("Marcia", null, avoMaterna);

	    Pessoa filho1 = new Pessoa("Alex Vinicius", pai, mae);
	    Pessoa filho2 = new Pessoa("Maria Luiza", pai, mae);
	        
	    Pessoa outraMae = new Pessoa("Julia");
	    Pessoa meioIrmao = new Pessoa("Pedro", pai, outraMae);
	    
	    Pessoa cloneFilho1 = new Pessoa("Alex Vinicius", pai, mae);

	    System.out.println("ÁRVORE GENEALÓGICA\n");
        System.out.println("Nome: " + filho1.getNome());
        System.out.println("Pai: " + filho1.getPai().getNome() + " (Avô Paterno: " + pai.getPai().getNome() + ")");
        System.out.println("Mãe: " + filho1.getMae().getNome() + " (Avó Materna: " + mae.getMae().getNome() + ")");
        System.out.println();

        System.out.print(filho1.getNome() + " e " + filho2.getNome() + " são irmãos? ");
        if (filho1.verificarIrmaos(filho2)) {
            boolean mesmoPai = filho1.getPai() == filho2.getPai();
            boolean mesmaMae = filho1.getMae() == filho2.getMae();
            if (mesmoPai && mesmaMae) {
                System.out.println("Sim, de mesmo pai e mesma mãe.");
            } else {
                System.out.println("Sim, mas são meio-irmãos.");
            }
        } else {
            System.out.println("Não.");
        }

        System.out.print(filho1.getNome() + " e " + meioIrmao.getNome() + " são irmãos? ");
        if (filho1.verificarIrmaos(meioIrmao)) {
            boolean mesmoPai = filho1.getPai() == meioIrmao.getPai();
            boolean mesmaMae = filho1.getMae() == meioIrmao.getMae();
            if (mesmoPai && mesmaMae) {
                System.out.println("Sim, de mesmo pai e mesma mãe.");
            } else {
                System.out.println("Sim, mas são meio-irmãos.");
            }
        } else {
            System.out.println("Não.");
        }
        
        System.out.print("Existem outra pessoa igual a " + filho1.getNome() + "?");
        if (filho1.equals(cloneFilho1)) {
            System.out.print(" Sim. Há outra pessoa com nome " + cloneFilho1.getNome() + " com a mesma mãe.");
        } else {
            System.out.print(" Não, são pessoas diferentes.");
        }
    }
}