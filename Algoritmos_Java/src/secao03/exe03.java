package secao03;

import java.util.Scanner;

public class exe03 {

	public static void main(String[] args) {
	// Calcular m�dia
		
	Scanner sc = new Scanner(System.in);
	
	int num1, num2; 
	float media;
	
	System.out.println("Informe a quantidade m�nima: ");
	num1 = sc.nextInt();
	
	System.out.println("Informe a quantidade m�xima: ");
	num2 = sc.nextInt();
	
	media = (num1 + num2) / 2;
	
	System.out.println("M�dia = " + media);

	
	sc.close();
	}

}
