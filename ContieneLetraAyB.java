package operaciones;

//3. Determina si una cadena de texto contienen la letra "a" y la letra "b".

import java.util.Scanner;

public class ContieneLetraAyB{
    public static void contieneAB (String [] args){
	System.out.println("Hola! vamos a determinar si una cadena de texto contiene las letras 'a' y 'b'.");
	String cadena1 = "";
	Scanner entrada = new Scanner (System.in);
	
	
	System.out.print("Por favor introduce aquí una cadena de texto: ");
	    cadena1 = entrada.nextLine();
	    boolean contieneA = cadena1.contains("a");
	    boolean contieneB = cadena1.contains("b");

	    if(contieneA == true && contieneB == true) {
		System.out.println("La cadena de texto '" + cadena1 + "' si contiene las letras 'a' y 'b'.");
	    } else if (contieneA == true && contieneB == false) {
		System.out.println("La cadena de texto '" + cadena1 + "' solo contiene la letra 'a'.");
	    } else if(contieneA == false && contieneB == true) {
		System.out.println("La cadena de texto '" + cadena1 + "' solo contiene la letra 'b'.");
	    } else {
	    	System.out.println("La cadena de texto '" + cadena1 + "' no cumple con la consigna.");
	    }
	
        entrada.close();
    }

}