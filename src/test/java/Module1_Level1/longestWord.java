package Module1_Level1;
import java.util.Scanner;

public class longestWord {
    public static void main(String[] args){
        // Scanner class allows to read user input data
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the phrase: ");
        // nextLine reads the next line of text as a String
        String ph = scanner.nextLine();

        // split the sentence into an array of words
        String [] words = ph.split(" ");

        // Initialize variables
        int maxLength = 0;
        String longWord = "";

        //for each loop
        for (String word : words){
            if (word.length() > maxLength) {
                maxLength = word.length();
                longWord = word;
            }
        }
        System.out.println("Longest word of the phrase is: " + longWord);
    }
}
