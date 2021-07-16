package secao03;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
	// receber 2 numeros e somar eles
		
	int num1, num2, soma;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o primeiro numero: ");
	num1 = sc.nextInt();
	
	System.out.println("Digite o segundo numero: ");
	num2 = sc.nextInt();
	
	soma = num1 + num2;
	
	System.out.println("A soma é: " + soma);
		
	
	sc.close();
	}

}
