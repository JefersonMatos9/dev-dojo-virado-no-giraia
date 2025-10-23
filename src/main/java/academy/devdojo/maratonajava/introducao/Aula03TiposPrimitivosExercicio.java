package academy.devdojo.maratonajava.introducao;
/*Pratica
 Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem

 Eu <nome>, morando no endereço <endereço>
 confirmo que recebi o salario de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Jeferson de Matos Santos";
        String endereco = "Avenida Joaquim Vieira Nunes";
        double salario = 12000;
        String dataRecebimento = "20/12/21";
        String relatorio = "Eu " + nome + ",morando no endereço " + endereco + " confirmo que recebi o salario de " + salario + " na data " + dataRecebimento;

        System.out.println(relatorio);
    }


}
