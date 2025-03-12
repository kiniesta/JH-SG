package org.example;

/**
 * Clase A que almacena y gestiona datos de una persona.
 */
class persona {
    /** Nombre de la persona */
    public static String nombre = "SinNombre";
    /** Edad de la persona */
    public static int edad = 0;
    /** Salario de la persona */
    public static double salario = 0.0;

    /**
     * Método para asignar valores a los atributos de la persona.
     * 
     * @param n Nombre de la persona.
     * @param e Edad de la persona.
     * @param s Salario de la persona.
     */
    public static void datos(String n, int e, double s) {
        nombre = n;
        edad = e;
        salario = s;
    }
    /** Método para mostrar los datos de la persona */
    public static void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }
}
/**
 * Clase B que calcula el bono en base a la edad y salario de la persona.
 */
class bono {
    /**
     * Método para calcular y mostrar el bono correspondiente.
     */
    void calcularBono() {
        double bono = 0;
        if (persona.edad > 50) {
            bono = persona.salario * 0.10;
        } else {
            bono = persona.salario * 0.05;
        }
        System.out.println("Bono: " + bono);
    }
}
/** 
 * Clase C imprime un saludo custom
 */
class saludo {
    /** Metodo para imprimir el saludo */
    void imprimirSaludo() {
        if (persona.edad < 18) {
            System.out.println("Hola, joven " + persona.nombre);
        } else {
            System.out.println("Hola, señor/a " + persona.nombre);
        }
    }
}
/**
 * Clase principal Main que ejecuta el programa.
 */
public class Main {
    /**
     * Método principal que ejecuta la lógica del programa.
     * 
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        persona.datos("Juan Perez", 45, 50000);
        persona.mostrar();
        bono b = new bono();
        b.calcularBono();
        saludo c = new saludo();
        c.imprimirSaludo();
    }
}
