
public class Ejercicio04App {
	public static void main(String[] args) {
		
		/*
		 * Escribe un programa en Java que declare
		 * una variable entera N y asígnale un valor.
		 * A continuación escribe las instrucciones
		 * que realicen los siguientes:
		 * - Incrementar N en 77
		 * - Decrementarla en 3
		 * - Duplicar su valor
		 */
		
		// Declaramos la variable N
		
		int n = 3;
		
		// Valor inicial
		System.out.println("El valor inicial de la variable N es: " + n);
		
		// Incrementar N en 77
		n += 77;
		System.out.println("La variable N + 77 es: " + n);
		
		// Decrementarla en 3
		n -= 3;
		System.out.println("La variable N - 3 es: " + n);
		
		// Duplicar su valor
		n *= 2;
		System.out.println("La variable N * 2 es: " + n);
	}
}
