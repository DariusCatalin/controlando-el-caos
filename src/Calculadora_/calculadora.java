package Calculadora_;

import java.util.Scanner;

// Es buena práctica que el nombre de la clase empiece con mayúscula
public class calculadora { 
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
          
            System.out.println("=== Calculadora Básica ===");
            int a;
            int b;

	        System.out.println("=== Calculadora Básica ===");
	        int a;
	        int b;

			System.out.print("a = ");
			a = sc.nextInt();
			System.out.print("b = ");
			b = sc.nextInt();
	 
	        System.out.println("Suma: " + (a + b));
	        System.out.println("Resta: " + (a - b));
	        System.out.println("Multiplicación: " + (a * b));
	        System.out.println("División: " + (a / b));
			    System.out.println("Raíz de a: " + Math.sqrt(a) + "; Raíz de b: " + Math.sqrt(b));
			    System.out.println("Potencia: Potencia de a: " + ((double)(Math.pow(a, 2))));
			    System.out.println("Potencia: Potencia de b: " + ((double)(Math.pow(b, 2))));
          System.out.println("Porcentaje (b% de a): " + (a / b * 100.0));
	    }
	}

