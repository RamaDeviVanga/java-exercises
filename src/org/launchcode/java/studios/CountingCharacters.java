package org.launchcode.java.studios;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args){
        int i;
        HashMap<Character, Integer> hm = new HashMap<>();
        //taking input from user
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your string as input:");
        String s=in.next();
        //String s ="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        String myString = s.toLowerCase();//changing string to lower case
        char[] charactersInString = myString.toCharArray();

        //counting the characters and putting values in hashmap
         for(i=0; i< (charactersInString.length); i++) {
                 char ch=charactersInString[i];
                 //checking character is alphabet or not
                 if( Character.isLetter(ch)) {
                     if (hm.containsKey(ch))
                         hm.put(ch, hm.get(ch) + 1);
                     else
                         hm.put(ch, 1);
                 }
         }
         //printing hashmap as key value pairs
        System.out.println("Count of each character in given string:");
        for(Map.Entry<Character, Integer> h : hm.entrySet()) {
            System.out.println(h.getKey()+"   " +  h.getValue());

        }
    }
}


