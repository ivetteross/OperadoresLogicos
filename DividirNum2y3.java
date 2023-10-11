package operaciones;

//2. Verifica si un número es divisible por 2 y por 3.

import java.util.Scanner;

public class DividirNum2y3{
     
    public static void dividir (String args []){

        System.out.println("Vamos a verificar si un número puede dividirse entre 2 y entre 3.");
        
        int num1 = 0;
	Scanner entrada = new Scanner (System.in);
	
	try{
	    System.out.print("Por favor ingresa el número que deseas verificar: ");
	    num1= entrada.nextInt();
	    if (num1 % 2 == 0 && num1 % 3 == 0){
		System.out.println("Este número SI es divisible entre 2 y entre 3");
	    }else{
		System.out.println("Este número NO cumple con la consigna");
	    }
	}catch (Exception err){ 
		System.out.println("Hubo un error, por favor ingresa un número válido");
	}finally{
		entrada.close();
	}
  
    }

}

