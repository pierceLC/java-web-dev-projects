package org.launchcode;

import java.util.Scanner;
public class StringSearch {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, "
                + "and of having nothing to do: once or twice she had peeped into the book her sister was reading, "
                + "but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice "
                + "‘without pictures or conversation?’";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a term to search for: ");
        String searchTerm = scanner.nextLine();

        boolean found = sentence.toLowerCase().contains(searchTerm.toLowerCase());

        if (found) {
            int index = sentence.toLowerCase().indexOf(searchTerm.toLowerCase());
            int length = searchTerm.length();

            System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
            String modifiedSentence = sentence.replace(searchTerm, "");
            System.out.println("Modified sentence: " + modifiedSentence);

        } else {
            System.out.println("Term not found in the sentence.");
        }
    }
}

