package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
// doar se salario > 5000
        double salario = 6000;

// (condição) ? verdadeiro : falso
        String resultado = salario > 5000 ? "Eu vou doar 500" : "Ainda não tenho condições mas vou ter";

        System.out.println(resultado);
    }
}
