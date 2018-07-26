package core;

import java.util.Arrays;

public class CribaEratostenes {

	public static int[] generaCriba(int tope){

		if (tope >= 2){
			boolean esPrimo[] = crearArray (tope);

			for (int i = 2; i< Math.sqrt(esPrimo.length) + 1; i++){

				if (esPrimo[i]){

					for (int j = 2*i; j < esPrimo.length; j+=i){
						esPrimo[j] = false;
					}
				}
			}

			return obtenerPrimos(esPrimo);
		} else {
			return new int[0];
		}
	}

	private static boolean[] crearArray (int tope) {

		int dim = tope+1;
		boolean[] primo = new boolean[dim];

		Arrays.fill(primo,true);

		primo[0] = primo[1] = false;

		return primo;
	}

	private static int contarPrimos (boolean esPrimo[]) {

		int cuenta = 0;

		for (boolean estado : esPrimo){
			if (estado) cuenta++;
		}

		return cuenta;
	}

	private static int[] obtenerPrimos (boolean esPrimo[]) {
		int cuenta = contarPrimos(esPrimo);
		int primos[] = new int[cuenta];

		for (int i = 0, j = 0; i < esPrimo.length; i++){
			if (esPrimo[i]) primos[j++] = i;
		}

		return primos;
	}
}
