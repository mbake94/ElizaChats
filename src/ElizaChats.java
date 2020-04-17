/*
Start with greeting message
Ask user for name
intake name using scanner class
prompts to tell Eliza how your day has been
Print user input
 */
import java.util.Scanner;


public class ElizaChats {
    public static void main (String[] args) {
        System.out.print("Welcome to ElizaChats! My name is Eliza, What's your name? ");
        Scanner keybd = new Scanner(System.in);
        String name;
        name = keybd.next();
        System.out.printf("Nice to meet you %s, How has your day been? ", name);
        Scanner keyb = new Scanner(System.in);
        String response;
        response = keyb.nextLine();
        //System.out.printf("%d ", response);
        System.out.print("Just kidding, I don't care. I'm actually just a computer. :) ");
    }
}


