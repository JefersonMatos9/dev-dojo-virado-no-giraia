package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //Se estiver vazio oque vai imprimir é
        //byte,short ,int , long, float e double = 0
        //char '\u0000 ' ' '
        //boolean false
        //String null

        String[] nomes = new String[5];

        nomes[0] = "Deco";
        nomes[1] = "Miguel";
        nomes[2] = "Josi";
        nomes[3] = "Marly";
        nomes[4] = "Lourdes";

        //length vai ate o ultimo nome do array ou da lista
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);

        }

    }
}
