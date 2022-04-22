package Ejemplo1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Escribe un numero: "); num1 = sc.nextInt();
		System.out.print("Escribe otro numero: "); num2 = sc.nextInt();
		
		System.out.println("La suma del los numeros es: " + (num1 + num2));
		System.out.println("La resta del los numeros es: " + (num1 - num2));
		
 }
}
