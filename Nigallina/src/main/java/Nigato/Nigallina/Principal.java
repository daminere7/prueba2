package Nigato.Nigallina;

import java.io.IOException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Principal {

	private static final Logger LOGGER = LogManager.getLogger();

	// funcion principal donde se inicia la aplicacion
	public static void main(String[] args) {
		try {
			LOGGER.info("Línea leída: 12");
			long aux;
			do {
				aux = nModuloM();
				if (aux != -1) {
					System.out.println(aux);
				}
			} while (aux != -1);
			LOGGER.info("Línea leída: 26");
		} catch (IOException e) {
			System.err.println("Error en la E/S");
			LOGGER.error("Error en la E/S");
		}
	}

	// funcion que solicita una línea al usuario con el patrón X % Y y devuelve el
	// resultado de la operación X modulo Y. El usuario debera introducir -1 para
	// finalizar
	public static long nModuloM() throws IOException {
		long n;
		int m;
		String str = "";
		str = pideLinea();
		n = Long.valueOf(str.substring(0, str.indexOf(' ')));
		LOGGER.debug("n: " + n);
		m = Integer.valueOf(str.substring(str.lastIndexOf(' ') + 1));
		LOGGER.debug("m: " + m);
		if (n != 0 && m != 0) {
			LOGGER.info("resultado: " + n % m);
			return (n % m);
		} else {
			LOGGER.warn("Se devuelve -1");
			return -1;
		}
	}

	// pide linea de texto al usuario
	public static String pideLinea() throws IOException {
		Scanner sc = new Scanner(System.in);
		String str = "";
		System.out.print("Introduce una linea: ");
		str = sc.nextLine();
		LOGGER.info("Línea leída: 57");
		return str;
	}
}