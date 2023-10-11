package operaciones;

//1. Comprueba su un número es mayor que 10 y menor que 20. 
   import java.util.Scanner;

   public class Mayor10Menor20{

	public static void mayorMenor (String args []){
            System.out.println("Hola! Vamos a verificar si un número es mayor que 10 y es menor que 20.");
	    int num1 = 0;
	    Scanner entrada = new Scanner (System.in);

            try{
                System.out.print("Por favor ingresa el número que deseas verificar: ");
                num1 = entrada.nextInt();
	        if (num1 > 10 && num1 < 20){System.out.println("Este número es mayor que 10 y es menor que 20");
   	        }else {System.out.println("Este número no entra dentro de la categoría 'entre 10 y 20', intenta con otro número.");
	        }
	    }catch (Exception err){
		System.out.println("Hubo un error, por favor ingresa un número válido");
	    }finally{
		entrada.close();
	    }
        }	
   }
