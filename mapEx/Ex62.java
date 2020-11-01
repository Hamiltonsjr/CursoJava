package mapEx;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex62 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> countVote = new LinkedHashMap<>();

        System.out.print("Enter file full path: ");
        String path = scanner.nextLine();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){

            String line = bufferedReader.readLine();
            while (line != null){

                String[] fields = line.split(",");
                String name = fields[0];
                int count = Integer.parseInt(fields[1]);

                if(countVote.containsKey(name)){
                    int voteSoFar =countVote.get(name);
                    countVote.put(name,count + voteSoFar);

                }
                else {
                    countVote.put(name,count);
                }
            }

        }catch (Exception e){
            System.out.println("Error " + e.getMessage());

        }
        for (String key:countVote.keySet()) {
            System.out.print(key + ": " + countVote.get(key));
            
        }

        scanner.close();
    }
}
