import java.util.Scanner;

public class Objective2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double guess = 50;
        double change = 25;
        System.out.println("Is your number "+guess+"?");
        String answer = input.nextLine();
        while(!answer.equals("correct"))
        {
            if(answer.equals("higher"))
            {
                guess += (int)(change);
                change += (1.5*change);
                answer = "";
            }
            if(answer.equals("lower"))
            {
                guess -= (int)(change);
                change -= (change*.5);
                answer = "";
            }
            System.out.println("Is your number " + guess + "?");
            answer = input.nextLine();
        }
    }
}
