package Module1_Level1;

import java.util.Scanner;

public class capitalize {
    public static void main (String[] args){
        // Enter a sentence
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");

        // nextLine reads the next line of text as a String
        String cap = scanner.nextLine();

        // split the sentence into an array of words
        String [] words = cap.split(" ");

        StringBuilder capsentence = new StringBuilder();

        //for each loop
        for (String word : words){
            String capword = word.substring(0,1).toUpperCase() + word.substring(1);
            capsentence.append(capword).append(" ");
        }
        System.out.println(capsentence.toString().trim());
    }

}
