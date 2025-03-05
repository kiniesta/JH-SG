package org.example;

/**
 * Clase A que almacena y gestiona datos de una persona.
 */
class A {
    /** Nombre de la persona */
    static String nombre = "SinNombre";
    /** Edad de la persona */
    static int edad = 0;
    /** Salario de la persona */
    static double salario = 0.0;

    /**
     * Método para asignar valores a los atributos de la persona.
     * 
     * @param n Nombre de la persona.
     * @param e Edad de la persona.
     * @param s Salario de la persona.
     */
    static void datos(String n, int e, double s) {
        nombre = n;
        edad = e;
        salario = s;
    }
    /** Método para mostrar los datos de la persona */
    static void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }
}
/**
 * Clase B que calcula el bono en base a la edad y salario de la persona.
 */
class B {
    /**
     * Método para calcular y mostrar el bono correspondiente.
     */
    void calcularBono() {
        double bono = 0;
        if (A.edad > 50) {
            bono = A.salario * 0.10;
        } else {
            bono = A.salario * 0.05;
        }
        System.out.println("Bono: " + bono);
    }
}
/** 
 * Clase C imprime un saludo custom
 */
class C {
    /** Metodo para imprimir el saludo */
    void imprimirSaludo() {
        if (A.edad < 18) {
            System.out.println("Hola, joven " + A.nombre);
        } else {
            System.out.println("Hola, señor/a " + A.nombre);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        A.datos("Juan Perez", 45, 50000);
        A.mostrar();
        B b = new B();
        b.calcularBono();
        C c = new C();
        c.imprimirSaludo();
    }
}
