package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //imprima todos o numeros pares ate 10000
        int numero = 100;

        for (int i = 0; i <= numero; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }

        }
    }
}
