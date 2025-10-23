package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.5 / 100;
        double valorImposto = 0;

        if (salarioAnual > 0 && salarioAnual <= 35.712) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34.713 && salarioAnual <= 68.507) {
            valorImposto = salarioAnual * segundaFaixa;
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println(valorImposto);
    }
}
