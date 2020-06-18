//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int cod = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Informe o código do combustivel:");
        System.out.println("[1] Álcool");
        System.out.println("[2] Gasolina");
        System.out.println("[3] Diesel");
        System.out.println("[4] Sair do programa");
        cod = sc.nextInt();

        while (cod  != 4){
            if (cod == 1){
                alcool = alcool + 1;
            }
            else if (cod == 2){
                gasolina = gasolina + 1;
            }
            else if (cod == 3){
                diesel = diesel + 1;

            }
            else if (cod > 4){
                System.out.print("Informe um código válido [1 a 4]:");
                cod = sc.nextInt();
            }
            else if (cod == 4){
                break;
            }
            System.out.print("Informe o códido do combustivel:");
            cod = sc.nextInt();
        }
        System.out.println("MUITO OBRIDAGO");
        System.out.printf("[%d] clientes abasteceram com Alcool.\n", alcool);
        System.out.printf("[%d] clientes abasteceram com Gasolina.\n", gasolina);
        System.out.printf("[%d] clientes abasteceram com Diesel.\n", diesel);
        sc.close();
    }

}
