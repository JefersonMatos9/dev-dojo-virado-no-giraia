package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        //Dado o valor de um carro descubra quantas vezes ele pode ser parcelado
        //Condicao valor parcela >= 1000

        double valorTotalCarro = 30000;

        for (int i = 1; i <= valorTotalCarro; i++) {
            double valorParcela = valorTotalCarro / i;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + i + " valor R$: " + valorParcela);
        }
    }
}
