
public class Ejercicio05App {
	public static void main(String[] args) {
		
		/*
		 * Programa java que declare cuatro variables
		 * enteras A, B, C y D y asígnale un valor a
		 * cada una. A continuación realiza las
		 * instrucciones necesarias para que:
		 * - B tome el valor de C
		 * - C tome el valor de A
		 * - A tome el valor de D
		 * - D tome el valor de B 
		 */
		
		// Declarando las variables
		
		int a = 5, b = 12, c = 54, d = 21;
		
		// Mostrando el valor de las variables
		
		System.out.println("El valor de la variable A es: " + a);
		System.out.println("El valor de la variable B es: " + b);
		System.out.println("El valor de la variable C es: " + c);
		System.out.println("El valor de la variable D es: " + d);
		
		// B tome el valor de C
		b = c;
		System.out.println("El valor de B es: " + b);
		
		// C tome el valor de A
		c = a;
		System.out.println("El valor de C es: " + c);
		
		// A tome el valor de D
		a = d;
		System.out.println("El valor de A es: " + a);
		
		// D tome el valor de B 
		d = b;
		System.out.println("El valor de D es: " + d);
		
	}
}
