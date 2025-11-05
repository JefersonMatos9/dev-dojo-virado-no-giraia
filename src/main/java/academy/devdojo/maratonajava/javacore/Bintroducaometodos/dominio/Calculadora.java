package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public double numero;
    public double numero1;

    public void somarDoisNumeros(double numero, double numero1) {
        double resultado = numero + numero1;
        System.out.println("Resultado da soma = " + resultado);
    }

    public void subtrairDoisNumeros(double numero, double numero1) {
        System.out.println("Resultado da subtração = " + (numero - numero1));
    }

    public void multiplicarDoisNumeros(double numero, double numero1) {
        System.out.println("Resultado da multiplicão = " + numero * numero1);
    }

    public void dividir(double numero, double divisor) {
        if (divisor == 0) {
            System.out.println("O numero não pode ser dividido por 0");
        } else {
            System.out.println("Resultado da divisão = " + numero / divisor);
        }
    }
}
