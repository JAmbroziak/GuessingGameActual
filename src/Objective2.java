import java.util.Scanner;

public class Objective2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double guess = 50;
        double change = 25;
        int guessCount = 1;
        System.out.println("Is your number "+guess+"?");
        String answer = input.nextLine();
        while(!answer.equals("correct")) {
            if (answer.equals("higher")) {
                guess += (int) (change);
                answer = "";
            }
            if (answer.equals("lower")) {
                guess -= (int) (change);
                answer = "";
            }
            if (change < 2)
            {
                change = 1;
            } else
            {
                change = (change * .5);
            }
            guessCount++;
            System.out.println("Is your number " + guess + "?");
            answer = input.nextLine();
        }
        if(guessCount == 1)
        {
            System.out.println("Wow, try harder. I got that in 1 guess.");
        } else
        System.out.println("Nice job, you made me take "+guessCount+" guesses.");
    }
}
