package com.campusdual.classroom;

public class Exercise {

    public static void main(String[] args) {
        System.out.println("Sumar los 10 primeros números positivos:");
        sumFirstNaturalNumbers(10);
        System.out.println("Mostrar los 20 primeros números naturales positivos:");
        showFirstNaturalNumbers(20);
    }

    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
        int total = 0;
        for (int i = 0; i <= num; i++) {
            total = total + i;
        }
        System.out.println("La suma desde 0 hasta " + num + " es " + total);
    }

    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        System.out.print("Números: ");
        for (int i = 0; i <= num; i++) {
            System.out.print(i);
            if (i < num) {
                System.out.print(", ");
            }
        }
        System.out.println(); // salto de línea final
    }
}
