package operaciones;

//16. Comprueba si un número es múltiplo de 3 y no es múltiplo de 5.

import java.util.Scanner;

public class MultiploTresNoCinco {
    public static void multiplo (String [] args){
	System.out.println("Este es un programa para verificar si un número es múltiplo de 3, pero no lo es de 5.");

	int numero1 = 0;

	Scanner entrada = new Scanner(System.in);

	try {
	    System.out.print("Por favor introduce el número a verificar: ");
	    numero1 = entrada.nextInt();

	    if ( (numero1 % 3 == 0) && (numero1 % 5 != 0) ){
	        System.out.println("Este número SI es múltiplo de 3 y NO es múltiplo de 5.");
	    } else {
	        System.out.println("Este número NO CUMPLE con la consigna");
	    }

	} catch (Exception e) {
	} finally {
	} entrada.close();
	
    }
}