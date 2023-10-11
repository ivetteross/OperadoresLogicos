package operaciones;

//5. Verifica si un número es par o si es múltiplo de 5.

import java.util.Scanner;

public class ParOMultiplode5 {
    public static void parMultiplo (String args[]){
	System.out.println("Hola! vamos a verificar si un número es par o si es múltiplo de 5");
	int num1 = 0;
	Scanner entrada = new Scanner(System.in);

	try{
	    System.out.print("Por favor ingres el número que deseas verificar: ");
	    num1 = entrada.nextInt();
	
	    if (num1 % 2 == 0 && num1 % 5 == 0){
		System.out.println("El número " + num1 + " es un número par y es un múltiplo de 5");
	    }else if (num1 % 2 == 0){
		System.out.println("El número " + num1 + " es número par, por lo tanto cumple con la consigna.");
	    }else if (num1 % 5 == 0){
		System.out.println("El número " + num1 + " es un múltiplo de 5, por lo tanto cumple con la consigna.");
	    }else{
		System.out.println("El número " + num1 + " no cumple con ninguna de las consignas.");
	    }	    
	}catch (Exception err){
		System.out.println("Hubo un error, por favor ingrese un número válido");
	} finally {
	}entrada.close();
    }
}
       
