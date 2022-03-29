package homework_week_8;

import java.util.Scanner;

public class Program_3 {

    public static void main(String[] args) {
        vowel(); // calling vowel method
    }

    public static void vowel() {
        // User input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your alphabet: ");
        char ch = sc.next().charAt(0);

        // printing Vowel ==> a, e, i, o, u
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel");
        } else
            System.out.println(ch + " is a consonant");
    }

}
