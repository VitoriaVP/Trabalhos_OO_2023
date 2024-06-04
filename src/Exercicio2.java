import java.util.Scanner;


public class Exercicio2 {
    public static void main(String[] args) {

        int distancia,combustivel,consumo;
        double Consumo;
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a distãncia percorrida(em km): ");
        distancia = ler.nextInt();

        System.out.print("Digite o total de combustivel gasto (em litros): ");
         combustivel = ler.nextInt();

         // Converte (faz um cast) do tipo int para o tipo double
        Consumo = (distancia / combustivel);


    System.out.println("Seu carro esta fazendo a média de : " + Consumo + " km por rodada ");

    }
}
