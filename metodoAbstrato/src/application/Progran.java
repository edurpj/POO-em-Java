package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Shape;
import entities.retangule;
import entities.color.Color;

public class Progran {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.println("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i= 0; i <= n; i++) {
			System.out.println("Shapes #" + i + "Date: ");
			System.out.println("Retangule or circle: (r / c): ");
			char ch = sc.next().charAt(0);
			System.out.println("Color? Blue/Black/Red");
			Color color = Color.valueOf(sc.next());
			if(ch == 'r') {
				System.out.println("Width: ");
				double width = sc.nextDouble();
				System.out.println("Height: ");
				double heigth = sc.nextDouble();
				list.add(new retangule(color, null, null));
			}else {
				System.out.println("Radious: ");
				double radious = sc.nextDouble();
				list.add(new Circle(color, radious));
			}
		}
		
		System.out.println();
		System.out.println("Shape area: ");
		for(Shape shape : list) {
			System.out.println(shape.area());
		}
		
		sc.close();
	}

}
