package secao03;

import java.util.Scanner;

public class exe03 {

	public static void main(String[] args) {
	// Calcular média
		
	Scanner sc = new Scanner(System.in);
	
	int num1, num2; 
	float media;
	
	System.out.println("Informe a quantidade mínima: ");
	num1 = sc.nextInt();
	
	System.out.println("Informe a quantidade máxima: ");
	num2 = sc.nextInt();
	
	media = (num1 + num2) / 2;
	
	System.out.println("Média = " + media);

	
	sc.close();
	}

}
