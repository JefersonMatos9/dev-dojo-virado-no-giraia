package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //+-/*
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero02 * numero01;

        System.out.println("O resultado dos numeros é " + resultado);

        //% resto
        int resto = 21 % 6;

        System.out.println("O resto da operação é " + resto);

        //<> <= >= == != sempre retorna valores booleanos

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezIgualADez = 10 == 10;
        boolean isDezDiferenteDeDez = 10 != 10;

        System.out.println("10 é maior que 20 " + isDezMaiorQueVinte);
        System.out.println("10 é menor que 20 " + isDezMenorQueVinte);
        System.out.println("10 é igual a 20 " + isDezIgualAVinte);
        System.out.println("10 é igual a 10 " + isDezIgualADez);
        System.out.println("10 é diferente de 10 " + isDezDiferenteDeDez);

        // && (and) || (or) ! (not)

        int idade = 35;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario <= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalCorrente = 200;
        double valorTotalPoupanca = 10000;
        float valorPlaystation = 5000f;

        boolean isPlayCincoCompravel = valorTotalCorrente > valorPlaystation || valorTotalPoupanca > valorPlaystation;
        System.out.println("isPlaystation cinco compravel " + isPlayCincoCompravel);

        // =  += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println(bonus);

        // ++ --

        int contador = 0;
        contador += 1; // contador = contador + 1
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println(contador);

    }
}
