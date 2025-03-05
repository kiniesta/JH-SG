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

    
    static void datos(String n, int e, double s) {
        nombre = n;
        edad = e;
        salario = s;
    }

    static void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }
}

class B {
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

class C {
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
