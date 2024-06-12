package cl.calculadora;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();
		Integer numA;
		Integer numB;
		Integer contador;
		Integer opcionI;

		System.out.println("Ingresa el número A que quieres calcular a continuación: ");
		numA = Integer.parseInt(sc.nextLine());

		System.out.println("Ahora ingresa el número B que quieres calcular: ");
		numB = Integer.parseInt(sc.nextLine());

		System.out.println("Las operaciones disponibles son: ");
		System.out.println("1. Sumar: A + B");
		System.out.println("2. Restar: A + B");
		System.out.println("3. Multiplicar: A + B");
		System.out.println("4. Dividir: A + B");
		System.out.println("Ingresa la operación que quieres realizar (solo números): ");
		opcionI = Integer.parseInt(sc.nextLine());

		if (opcionI == 1) {
			System.out.println(calculadora.sumar(numA, numB));
		} else if (opcionI == 2) {
			System.out.println(calculadora.restar(numA, numB));
		} else if (opcionI == 3) {
			System.out.println(calculadora.multiplicar(numA, numB));
		} else if (opcionI == 4) {
			System.out.println(calculadora.dividir(numA, numB));
		} else {
			System.out.println("Opcion no valida");
		}




	}
}
