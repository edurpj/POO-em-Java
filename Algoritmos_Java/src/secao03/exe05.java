package secao03;

import java.util.Scanner;

public class exe05 {

	public static void main(String[] args) {
		// converter metros para cm
		
		int metros, cm;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a metragem para ser convertida: ");
		metros = sc.nextInt();
		
		cm = (metros * 100);
		
		System.out.println("Metros em cm é = " + cm + "cm");
		
		sc.close();

	}

}
