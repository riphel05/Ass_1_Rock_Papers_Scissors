import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        String trash = "";
        String player1 = "R, P, S";
        String player2 = "R, P, S";

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Player 1's move (R, P, S): ");
        if(in.hasNextLine())
        {
            player1 = in.nextLine();
        }
        else
        {
            System.out.println("You said player 1's move was: " + trash);
            System.out.println("Enter a valid move.");
            System.exit(0);
        }

        System.out.print("Enter Player 2's move (R, P, S): ");
        if(in.hasNextLine())
        {
            player2 = in.nextLine();
        }
        else
        {
            System.out.println("You said player 2's move was: " + trash);
            System.out.println("Enter a valid move.");
            System.exit(0);
        }

        if(player1.equalsIgnoreCase("R"))
            {
            if(player2.equalsIgnoreCase("R"))
            {
                System.out.println("Its a tie! R x R. ");
            }
            else if (player2.equalsIgnoreCase("P"))
            {
                System.out.println("Player 2 wins! R x P, paper covers rock. ");
            }
            else
            {
                System.out.println("Player 1 wins! R x S, rock crushes scissors. ");
            }
            }
        else if (player1.equalsIgnoreCase("P"))
           {
            if(player2.equalsIgnoreCase("R"))
           {
                System.out.println("Player 1 wins! P x R, paper covers rock. ");
           }
            else if (player2.equalsIgnoreCase("P"))
           {
                System.out.println("Its a tie! P x P. ");
           }
            else
           {
                System.out.println("Player 2 wins! P x S, scissors cut paper. ");
           }
           }
        else
           {
               if(player2.equalsIgnoreCase("R"))
               {
                   System.out.println("Player 2 wins! S x R, rock crushes scissors. ");
               }
               else if (player2.equalsIgnoreCase("P"))
               {
                   System.out.println("Player 1 wins! S x P, scissors cut paper. ");
               }
               else
               {
                   System.out.println("Its a tie! P x P. ");
               }
           }
        System.out.println("Would you like to play again? ");
    }
}