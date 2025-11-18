//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:
Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.
Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula y
se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es
Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).

Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:

N.es_A.ia_E.pe*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Creamos un objeto Scanner para leer los datos ingresados por el usuario
        Scanner scanner = new Scanner(System.in);

        // ---NOMBRE 1---
        System.out.println("Ingrese un nombre de un familiar o amigo:");

        String nombre1 = scanner.nextLine(); // Guardamos el primer nombre ingresado
        //Tomamos el segundo caracter, lo convertimos a mayuscula
        //agregamos un punto y luego concatenamos los dos ultimos caracteres del nombre
        String nombreA2 = nombre1.toUpperCase().charAt(1) + "." + nombre1.substring(nombre1.length()-2);

        System.out.println("Ingrese otro nombre de un familiar o amigo:");

        String nombre2 = scanner.nextLine();
        String nombreB2 = nombre2.toUpperCase().charAt(1) + "." + nombre2.substring(nombre2.length()-2);

        System.out.println("Ingrese otro nombre de un familiar o amigo:");

        String nombre3 = scanner.nextLine();
        String nombreC2 = nombre3.toUpperCase().charAt(1) + "." + nombre3.substring(nombre3.length()-2);

        //Creamos un String resultado para mostrar el resultado de lo 3 nombres
        String resultado = nombreA2 + "_" + nombreB2 + "_" + nombreC2;

        System.out.println(resultado);
    }
}