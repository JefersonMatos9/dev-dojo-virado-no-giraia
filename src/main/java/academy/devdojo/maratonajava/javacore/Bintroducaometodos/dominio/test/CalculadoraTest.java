package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somarDoisNumeros(20,22.5);
        calculadora.subtrairDoisNumeros(80,28.55);
        calculadora.multiplicarDoisNumeros(10,2);
        calculadora.dividir(10,0);
    }
}
