package ru.krista.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.getEquation();
        calc.doMath();
        calc.printResult();
}
}
