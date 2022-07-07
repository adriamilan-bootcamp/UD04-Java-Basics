
public class Ejercicio03App {
	public static void main(String[] args) {
		
		/* 
		 * Escribe un programa en Java que realice lo
		 * siguiente: declarar dos variables X e Y de
		 * tipo int, dos variables N y M de tipo double
		 * y asigna a cada una un valor. A continuación
		 * muestra por pantalla:
		 * - El valor de cada variable
		 * - La suma X + Y
		 * - La diferencia X - Y
		 * - El producto X * Y
		 * - El cociente X / Y
		 * - El resto X % Y
		 * - La suma N + M
		 * - La diferencia N - M
		 * - El producto N * M
		 * - El cociente N / M
		 * - El resto N % M
		 * - La suma X + N
		 * - El cociente Y / M
		 * - El resto Y % M
		 * - El doble de cada variable
		 * - La suma de todas las variables
		 * - El producto de todas las variables
		*/
		
		// Declarando las variables
		
		int x = 5, y = 3;
		double n = 2.45, m = 7.55;
		
		// Mostrando el valor de las variables
		
		System.out.println("El valor de la variable X es: " + x);
		System.out.println("El valor de la variable Y es: " + y);
		System.out.println("El valor de la variable N es: " + n);
		System.out.println("El valor de la variable M es: " + m);
		
		// Resultado de las operaciones
		
		System.out.println("La suma de X + Y es: " + (x + y));
		System.out.println("La diferencia de X - Y es: " + (x - y));
		System.out.println("El producto de X * Y es: " + (x * y));
		System.out.println("El cociente de X / Y es: " + (x / y));
		System.out.println("El resto de X % Y es: " + (x % y));
		
		System.out.println("La suma de N + M es: " + (n + m));
		System.out.println("La diferencia de N - M es: " + (n - m));
		System.out.println("El producto de N * M es: " + (n * m));
		System.out.println("El cociente de N / M es: " + (n / m));
		System.out.println("El resto de N % M es: " + (n % m));
		
		System.out.println("La suma de X + N es: " + (x + n));
		System.out.println("El cociente de Y / M es: " + (y / m));
		System.out.println("La resto de Y % M es: " + (x + n));
		
		System.out.println("El doble de X es: " + (x * 2));
		System.out.println("El doble de Y es: " + (y * 2));
		System.out.println("El doble de N es: " + (n * 2));
		System.out.println("El doble de M es: " + (m * 2));
		
		System.out.println("La suma de todas las variables X + Y + N + M es: " + (x + y + n + m));

		System.out.println("El producto de todas las variables X * Y * N * M es: " + (x * y * n * m));
		
	}
}
