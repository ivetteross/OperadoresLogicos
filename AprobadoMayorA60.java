package operaciones;

//6. Determina si un estudiante ha aprobado si su nota es mayor o igual a 60 y menor o igual a 100.

import java.util.Scanner;
    
public class AprobadoMayorA60{
    public static void aprobado (String args[]){
	System.out.println("Este es un sistema para verificar si un estudiante ha aprobado.");
	int num1 = 0;
	String estudiante = "";
	Scanner entrada = new Scanner(System.in);

	try {
	    System.out.print("Ingresa el nombre del (la) estudiante: ");
	    estudiante = entrada.nextLine();
	    System.out.print("Ingresa la calificación del (la) estudiante: ");
	    num1 = entrada.nextInt();
	    if (num1 >= 60 && num1 <= 100){
		System.out.println("El (la) estudiante " + estudiante + " ha aprobado");
	    }else{
		System.out.println("El (la) estudiante " + estudiante + " no ha aprobado");
	    }
	} catch (Exception err){
	    System.out.println("Lo sentimos, hubo un error, por favor ingresa un número válido");
	} finally {
	    entrada.close();
	}
    }
}