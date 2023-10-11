package operaciones;

//4. Comprueba si un número es positivo y no es igual a  cero.

import java.util.Scanner;

public class PositivoNoIgualACero{
    public static void positivo (String args []){
	System.out.println("Vamos a comprobar si un número es positivo y es diferente de cero.");
	int num1 = 0;
	Scanner entrada = new Scanner(System.in);

	try{
	    System.out.print("Por favor introduce el número que deseas comprobar: ");
	    num1 = entrada.nextInt();
	    if(num1 > 0 && num1 != 0){
	    System.out.println("El número " + num1 + " es positivo y no es igual a cero");
	    }else{
	    System.out.println("El número no cumple con la consigna 'positivo y no igual a cero' ");
	    }
	}catch (Exception err){
	    System.out.println("Hubo un error, por favor ingresa un número válido");
	}finally{
	    entrada.close();
	}
    }
}