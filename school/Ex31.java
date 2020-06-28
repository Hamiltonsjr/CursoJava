// Crie um programa para ler o nome de um aluno e as trẽs notas que ele obteve nos três trimestres do ano
// Primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada. Ao final mostrar qual a nota final do aluno no ano.
// Dizer também se o aluno está aprovado (PASS) ou não (FAILED)e, em caso negativo, quantos pontos faltam para o aluno
// obter o minimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para resolver.

import java.util.Locale;
import java.util.Scanner;
import school.Student;

public class Ex31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);
        Student student = new Student();
        System.out.print("Nome do Aluno:");
        student.name = sc.nextLine();
        System.out.print("Primeiro Trimestre:");
        student.noteOne = sc.nextDouble();
        System.out.print("Segundo Trimestre:");
        student.noteTwo = sc.nextDouble();
        System.out.print("Terceiro Trimestre:");
        student.noteThree = sc.nextDouble();

        student.finalGrade();
        System.out.println(student.toString());

        if (student.finalGrade() < 60.0){
            System.out.println("FAILED");
            System.out.printf("Faltou %.2f pontos", student.passOurFailed());
        }
        else{
            System.out.println("PASS");
        }
        sc.close();
    }
}
