  package secao02;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		// Receber 2 numeros e multiplica pelo primeiro
		
		int num1, num2, multi, soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero: ");
		num1  = sc.nextInt();
		
		System.out.println("Informe o segundo n�mero: ");
		num2 = sc.nextInt();
		
		soma = num1 + num2;
		multi = soma * num1;
		
		System.out.println("O resultado �: " + multi);
		
		sc.close();
		
	}

}

