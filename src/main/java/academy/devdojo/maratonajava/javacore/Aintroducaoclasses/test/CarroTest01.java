package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();

        carro.nome = "Ford Ka";
        carro.modelo = "hatch";
        carro.ano = 2018;

        carro1.nome = "Gol G5";
        carro1.modelo = "hatch";
        carro1.ano = 2009;

        carro.exibirInformacoes();
        carro1.exibirInformacoes();
    }
}
