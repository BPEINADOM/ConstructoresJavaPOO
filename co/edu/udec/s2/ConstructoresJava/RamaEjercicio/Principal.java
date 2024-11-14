package RamaEjercicio;

import java.util.Scanner;

import RamaEjercicio.Domain.Model.CuentaBancaria;
import RamaEjercicio.Domain.Model.Estudiante;
import RamaEjercicio.Domain.Model.Libro;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("*********************************************");
        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");

        // Detalles del libro predeterminados
        Libro libroPredeterminado = new Libro();
        System.out.println("Detalles del libro predeterminado");
        System.out.println(libroPredeterminado);
        System.out.println("*********************************************");

        // Solicitud de datos para un nuevo libro
        System.out.println("Ingrese el titulo del libro: ");
        String titulo = scanner.nextLine();

        System.out.println("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();

        System.out.println("Ingrese el numero de paginas: ");
        int numerodepaginas = scanner.nextInt();
        scanner.nextLine();

        Libro libroDetallado = new Libro(titulo, autor, numerodepaginas);
        System.out.println("*********************************************");
        System.out.println("Detalles del libro detallado:");
        System.out.println(libroDetallado);
        System.out.println("*********************************************");


        // Detalles de la cuenta bancaria por defecto
        CuentaBancaria cuentaPredeterminada = new CuentaBancaria();
        System.out.println("Detalles de la cuenta bancaria predeterminada:");
        System.out.println(cuentaPredeterminada);
        System.out.println("*********************************************");


        // Solicitud de datos de una cuenta bancaria usando 2 parametros
        System.out.println("Ingrese el numero de cuenta: ");
        int numeroCuenta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el tipo de cuenta: ");
        String tipoCuenta = scanner.nextLine();
        

        // Detalles de la cuenta bancaria con 2 parametros
        CuentaBancaria cuentaParametros = new CuentaBancaria(numeroCuenta, tipoCuenta);
        System.out.println("*********************************************");
        System.out.println("Detalles de la cuenta bancaria parametrizada:");
        System.out.println(cuentaParametros);
        System.out.println("*********************************************");


        // Solicitud de datos de una cuenta bancaria sobrecargado
        System.out.println("Ingrese el saldo de la cuenta: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        // Detalles de la cuenta bancaria sobrecargado
        CuentaBancaria cuentaSobrecargado = new CuentaBancaria(numeroCuenta, saldo, tipoCuenta);
        System.out.println("*********************************************");
        System.out.println("Detalles de la cuenta bancaria sobrecargado:");
        System.out.println(cuentaSobrecargado);
        System.out.println("*********************************************");


        // Datos del estudiante por defecto
        Estudiante estudiantePredeterminado = new Estudiante();
        System.out.println("Datos del estudiante predeterminado:");
        System.out.println(estudiantePredeterminado);
        System.out.println("*********************************************");


        // Solicitud de datos del estudiante de nombre y edad
        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la edad del estudiante:");
        int edad = scanner.nextInt();
        scanner.nextLine();

        // Datos nombre y edad del estudiante
        Estudiante estudianteNombreEdad = new Estudiante(nombre, edad);
        System.out.println("*********************************************");
        System.out.println("Datos nombre y edad del estudiante");
        System.err.println(estudianteNombreEdad);
        System.out.println("*********************************************");


        // Solicitud de los datos completos del estudiante
        System.out.println("Ingrese el curso del estudiante:");
        String curso = scanner.nextLine();

        // Datos completos del estudiante
        Estudiante estudianteDatos = new Estudiante(nombre, edad, curso);
        System.out.println("*********************************************");
        System.out.println("Datos completos del estudiante:");
        System.out.println(estudianteDatos);
        System.out.println("*********************************************");


        scanner.close();


    }
}
