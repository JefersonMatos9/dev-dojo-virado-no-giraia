package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //while , do while , for

        int count = 10;

        while (count < 10){
            ++count; // incrementa 1 antes de começar a contagem
            System.out.println(count);
        }
        count = 0;
        do{
            System.out.println("Dentro do do while " + ++count);
        }while (count < 10);

        for (int i = 0; i < count; i++) {
            System.out.println("For " + i);
        }
    }
}