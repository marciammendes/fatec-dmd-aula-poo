package aula2;

public class exercicio3FarenheitA {	
	public static void main(String[] args) {
		double fDouble = 40.0; //valor definido direto na variavel
		double CDouble = (fDouble - 32.0) * (5.0 / 9.0);
		System.out.println("a) Temperatura (°C) = " + CDouble);
	
		int fInt = 40;
		int CInt = (fInt - 32) * 5 / 9;
		System.out.println("b) Temperatura (°C) = " + CInt);
	}
}

//Se colocar 5/9 no parenteses, o java zera a divisao