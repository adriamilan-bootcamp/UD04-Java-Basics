
public class Ejercicio02App {
	public static void main(String[] args) {
		
		/* 
		 * Escribe un programa Java que realice lo siguiente
		 * declarar una variable N de tipo int, una variable
		 * A de tipo double y una variable C de tipo char
		 * y asigna a cada una un valor.
		*/
		
		/* 
		 * A continuación muestra por pantalla:
		 * El valor de cada variable.
		 * La suma de N + A
		 * La diferencia de A - N
		 * El valor numérico correspondiente al carácter
		 * que contiene la variable C 
		*/
		
		/* 
		 * Si por ejemplo le hemos dado a N el valor de 5,
		 * a A el valor 4.56 y a C el valor 'a', se debe
		 * mostrar por pantalla:
		 * Variable N = 5
		 * Variable A = 4.56
		 * Variable C = a
		 * 5 + 4.56 = 9.559999999999999
		 * 4.56 - 5 = -0.4400000000000004
		 * Valor numérico del carácter a = 97
		*/
		
		// Declarando las variables
		
		int n = 5;
		double a = 4.56;
		char c = 'a';
		
		// Mostrando el valor de las variables
		
		System.out.println("El valor de la variable N es: " + n);
		System.out.println("El valor de la variable A es: " + a);
		System.out.println("El valor de la variable C es: " + c);		
		
		// Resultado de las operaciones 

		System.out.println("La suma de N + A es: " + (n + a));
		System.out.println("La diferencia de A - N es: " + (a - n));
		int numericC = c; 
		System.out.println("El valor numérico de la variable C es: " + numericC);
		
	}
}
