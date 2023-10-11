import java.util.Scanner;
import operaciones.*;

public class Main{
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("EJERCICIOS CON OPERADORES LOGICOS");  
        System.out.println(" ");     
        System.out.println("1. Determinar si un usuario tiene acceso si ha ingresado un nombre de usuario y una contraseña váli0dos.");
        System.out.println("2. Determinar si un estudiante ha aprobado si su nota es mayor o igual a 60 y menor o igual a 100.");
        System.out.println("3. Verificar si una cadena de texto contiene la palabra 'Java' y no contiene la palabra 'Python'.");
        System.out.println("4. Determinar si una cadena de texto contienen la letra 'a' y la letra 'b'.");
        System.out.println("5. Verificar si un número es divisible por 2 y por 3.");
        System.out.println("6. Comprobar su un número es mayor que 10 y menor que 20.");
        System.out.println("7. Comprobar si un número es múltiplo de 3 y no es múltiplo de 5.");
        System.out.println("8. Verificar si un número es par o si es múltiplo de 5. ");
        System.out.println("9. Comprobar si un número es positivo y no es igual a  cero.");
        System.out.println("10. Determinar si un triángulo es equilátero o isósceles.");
        System.out.println(" ");

        try{
            System.out.print("POR FAVOR INGRESA EL NÚMERO DE LA OPERACIÓN QUE DESEAS REALIZAR: ");
            int opcion = scanner.nextInt();

            switch (opcion){
                case 1: 
                    AccesoCorrecto.acceso(args);
                    break;
                case 2:
                    AprobadoMayorA60.aprobado(args);
                    break;
                case 3:
                    ContieneJavaNoPython.contiene(args);
                    break;
                case 4:
                    ContieneLetraAyB.contieneAB(args);
                    break;
                case 5:
                    DividirNum2y3.dividir(args);
                    break;
                case 6:
                    Mayor10Menor20.mayorMenor(args);
                    break;
                case 7:
                    MultiploTresNoCinco.multiplo(args);
                    break;
                case 8:
                    ParOMultiplode5.parMultiplo(args);
                    break;
                case 9:
                    PositivoNoIgualACero.positivo(args);
                    break;
                case 10:
                    TipoDeTriangulo.triangulo(args);
                    break;
            }
        
        }catch(Exception e){
            System.out.println("Error " + e);
        }finally{
            scanner.close();
        }
        


    }

}