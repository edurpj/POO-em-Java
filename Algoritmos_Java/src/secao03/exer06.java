package secao03;

import java.util.Scanner;

public class exer06 {

	public static void main(String[] args) {
		//algoritmo que pergunte quanto vc ganha por hora e o numero trabalhado no mes
		// calcule o total do salario
		
		float valorHora, total;
		int horaT;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor que recebe por hora: ");
		valorHora = sc.nextFloat();
		
		System.out.println("Digite as horas trabalhada: ");
		horaT = sc.nextInt();
		
		total = (valorHora * horaT);
		
		System.out.println("Slaraio total de: " + "R$" + total);
		
		sc.close();
		

	}

}
