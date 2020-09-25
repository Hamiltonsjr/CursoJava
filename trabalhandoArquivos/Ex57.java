package trabalhandoArquivos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Ex57 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // dados dos itens estanciado em uma lista

        List<Itens> itensList = new ArrayList<>();

        // pedindo o caminho para o usuário.

        System.out.println("digite o nome do caminho:");
        String sourceFile = scanner.nextLine();

        // criando o arquivo.

        File file = new File(sourceFile);
        String sourceFolder = file.getParent();

        // pegando o caminho e criando uma sub pasta.

        boolean success = new File(sourceFolder + "/out").mkdir();

        // criando uma váriavel que vai receber o caminho mais um arquivo dentro da sub pasta.

        String targetFile = sourceFolder + "/out/summary.csv";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile))){

            String itemCvs = bufferedReader.readLine();
            while (itemCvs != null){

                // criando um vetor separando por virgula.

                String[] fields = itemCvs.split(",");

                // passando os dados cada um em seu lugar do vetor.]

                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                // adicionado na lista.

                itensList.add(new Itens(name,price,quantity));

                itemCvs = bufferedReader.readLine();
            }

            try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(targetFile))){

                for(Itens itens: itensList){
                    bufferedWriter.write(itens.getName() + "," + String.format("%.2f",itens.total()));
                    bufferedWriter.newLine();

                }

                System.out.println(targetFile + " CREATED !");

            }
            catch (IOException e){
                System.out.println("Erro1: " + e.getMessage());
            }

        }
        catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
        scanner.close();
    }

}
