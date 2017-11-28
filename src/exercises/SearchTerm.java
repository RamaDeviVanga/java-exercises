package exercises;

import java.util.Scanner;

public class SearchTerm {
    public static void main(String[] args) {
        String word;
        String str = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word to search: ");
        word = in.next();
        boolean res = str.contains(word);
        if (res == true)
            System.out.println(str.indexOf(word));
        else
            System.out.println("Word is not found");


    }
}