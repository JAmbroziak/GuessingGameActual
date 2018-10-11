import java.util.Scanner;

public class Objective1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int guessCount = 0;
        int diff = 0;
        System.out.println("Choose a difficulty: Type 1 for 1-10, 2 for 1-100, 3 for 1-1000, or 4 for 1-10000.");
        diff = input.nextInt();
        int secret = (int)(Math.random()*Math.pow(10, diff)+1);
        System.out.println("Take a guess at the secret number. I bet you won't get it first try.");
        int guess = input.nextInt();
        guessCount = 1;
        while(guess != secret)
        {
            System.out.println("Sorry, try again.");
            guess = input.nextInt();
            guessCount++;
        }
        System.out.println("Congrats! You guessed the number. It was "+secret+".");
        if(guessCount == 1)
        {
            System.out.println("First guess too. Cheater.");
        } else
        System.out.println("I took you "+guessCount+" guesses.");
    }
}
