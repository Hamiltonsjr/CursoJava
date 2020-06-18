//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args){

        int senha;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a senha:");
        senha = sc.nextInt();

        while(senha != 2002){
            System.out.println("SENHA INVÁLIDA...");
            System.out.print("Digite a senha:");
            senha = sc.nextInt();

        }
        System.out.println("SENHA CORRETA...");

        sc.close();

    }
}
