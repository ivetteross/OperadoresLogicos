package operaciones;

//9. Determina si un usuario tiene acceso si ha ingresado un nombre de usuario y una contraseña válidos.

import java.util.Scanner;

public class AccesoCorrecto{
    public static void acceso (String args[]){
	System.out.println("Bienvenido al sistema");
	String name1 = "Julia", name2 = "Jonathan";
	String username1 = "julia@gmail.com", username2 = "jonathan@gmail.com";
	String password1 = "JUL14", password2 ="J0N4TH4N";
		
	Scanner entrada = new Scanner(System.in);
	System.out.print("Por favor ingresa tu nombre: ");
	String nameIn = entrada.nextLine();
	
	if(nameIn.equalsIgnoreCase(name1)){
		System.out.print("Hola " + name1 + " , por favor ingresa tu usuario: ");
		String usernameIn1 = entrada.nextLine();
		System.out.print("Ahora ingresa tu contraseña: ");
		String passwordIn1 = entrada.nextLine();
		
		if (usernameIn1.equals(username1) && passwordIn1.equals(password1)){
		    System.out.println("Ha ingresado correctamente al sistema.");
		}else{
		    System.out.println("El usuario y/o la contraseña son incorrectos");
		}
	} else if (nameIn.equalsIgnoreCase(name2)) {
		System.out.print("Hola " + name2 + " , por favor ingresa tu usuario: ");
		String usernameIn2 = entrada.nextLine();
		System.out.print("Ahora ingresa tu contraseña: ");
		String passwordIn2 = entrada.nextLine();
		
		if (usernameIn2.equals(username2) && passwordIn2.equals(password2)){
		    System.out.println("Ha ingresado correctamente al sistema.");
		}else{
		    System.out.println("El usuario y/o la contraseña son incorrectos");
		}
	} else {
		System.out.println("El nombre ingresado no se encuentra registrado en el sistema.");
	}
	entrada.close();	
    }

    public static void main(Object args) {
    }
}