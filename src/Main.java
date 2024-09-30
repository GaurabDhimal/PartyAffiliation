import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String partyAfill = "";


        if(partyAfill.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant!");
        }
        else if(partyAfill.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic Donkey!");
        }
        else if(partyAfill.equalsIgnoreCase("I"))
        {
            System.out.println("You get an Independent Man!");
        }
        else
            System.out.println("I don't know what party you belong to!");
            System.out.println("Run the program again!");

    }
}