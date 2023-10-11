package operaciones;

//18. Determina si un triángulo es equilátero o isósceles.

import java.util.Scanner;

public class TipoDeTriangulo {
    public static void triangulo (String [] args){
	System.out.println("Este es un sistema para determinar si un triángulo es de tipo equilátero o isósceles.");
	
	int lado1 = 0;
	int lado2 = 0;
	int lado3 = 0;

	Scanner entrada = new Scanner(System.in);

	try{
	    System.out.print("¿Cuánto mide el primer lado?: ");
	    lado1 = entrada.nextInt();
	    System.out.print("¿Cuánto mide el segundo lado?: ");
	    lado2 = entrada.nextInt();
	    System.out.print("¿Cuánto mide el tercer lado?: ");
	    lado3 = entrada.nextInt();

	    if (lado1 == lado2 && lado1 == lado3){
	        System.out.println ("El triángulo es de tipo equilátero");
	    }else if ( (lado1 == lado2 && lado1 != lado3) || (lado1 == lado3 && lado1 != lado2) || (lado2 == lado3 && lado2 != lado1) ){
	        System.out.println ("El triángulo es de tipo isósceles");
	    }else{
		System.out.println ("El triángulo no es ni equilátero, ni isósceles, sino escaleno.");
	    }

	}catch(Exception e){
	}finally{
	}entrada.close();
	
    }

}