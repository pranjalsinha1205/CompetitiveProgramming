package day1;
import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
        String game = guessTheNumber();
        System.out.println(game);
    }
    public static String guessTheNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the number guessing game!\nYou get 3 tries to guess the number between 0 to 9");
        Random random = new Random();
        int randInt = random.nextInt(10);
        int tries = 0;
        String s = "Your 3 tries are over! The correct answer is " + randInt;
        while(tries < 3){
            System.out.print("Your number? ");
            int n = sc.nextInt();
            if(n == randInt){
                s = "Ding ding ding! The correct answer is " + n;
                break;
            }
            else if(n < randInt){
                System.out.println("Your guess is a little bit low");
            }
            else if(n > randInt){
                System.out.println("Your guess is a little bit high");
            }
        }
        return s;
    }
}
