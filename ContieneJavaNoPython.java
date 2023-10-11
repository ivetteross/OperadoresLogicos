package operaciones;

//17. Verifica si una cadena de texto contiene la palabra "Java" y no contiene la palabra "Python".

import java.util.Scanner;

public class ContieneJavaNoPython{
    public static void contiene (String [] args){
	System.out.println("Vamos a verificar si una cadena de texto contiene la palabra 'Java', pero no contiene la palabra 'Python'.");

	Scanner entrada = new Scanner(System.in);
	System.out.print("Por favor introduce una cadena de texto: ");
	String cadena1 = entrada.nextLine();

	boolean contieneJava = cadena1.toLowerCase().contains("java");
	boolean contienePython = cadena1.toLowerCase().contains("python");

	if (contieneJava == true && contienePython == false){
	    System.out.println("La cadena de texto '" + cadena1 + "' si contiene la palabra 'Java' y no contiene la palabra 'Python'.");
	}else{
	    System.out.println("La cadena de texto '" + cadena1 + "' no cumple con la consigna.");
	}

    entrada.close();
    }
}