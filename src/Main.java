import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        String playRPS = "";
        String continueYN ="";

        System.out.print("Play RPS? [Y/N]");
        playRPS = in.nextLine();

       if (playRPS.equalsIgnoreCase("Y"))
        {
            System.out.print("Enter player A move [RPS]: ");
            playerA = in.nextLine();
            playerA = playerA.toUpperCase();

            System.out.print("Enter player B move [RPS]: ");
            playerB = in.nextLine();
            playerB = playerB.toUpperCase();

            System.out.println("\nPlayer A: " + playerA + "Player B: " + playerB + "\n");

            if (!playerA.matches("[RPS]") || !playerB.matches("[RPS]")) //illegal move
            {
                System.out.println("Illegal move:\nPlayer A: " + playerA + "\nPlayer B: " + playerB);
            } else // gameplay
            {
                if (playerA.equals("R")) {
                    if (playerB.equals("R")) {
                        System.out.println("Rock vs rock, tie game");
                    } else if (playerB.equals("P")) {
                        System.out.println("Paper covers rock, player B wins");
                    } else //playerB scissors
                    {
                        System.out.println("Rock breaks scissors, player A wins");
                    }
                } else if (playerA.equals("P")) {
                    if (playerB.equals("R")) {
                        System.out.println("Paper covers rock, player A wins");
                    } else if (playerB.equals("P")) {
                        System.out.println("Paper vs paper, tie game");
                    } else //player B is scissors
                    {
                        System.out.println("Scissors cuts paper, player B wins");
                    }
                } else //player A is scissors
                {
                    if (playerB.equals("R")) {
                        System.out.println("Rock breaks scissors, player B wins");
                    } else if (playerB.equals("P")) {
                        System.out.println("Scissors cuts paper, player A wins");
                    } else //player B scissors
                    {
                        System.out.println("Scissors vs. scissors, tie game");
                    }

                }
            }
        } else if (playRPS.equalsIgnoreCase("Y"));
       System.out.print("Play again? [Y/N]");
       continueYN = in.nextLine();
    }
}



