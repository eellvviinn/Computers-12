import java.util.Scanner;

public class Rock_Paper_Scissors {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int wins = 0;
            int losses = 0;
        while (true) {
            System.out.println("would you like to play a game?");
            String startGame = scanner.nextLine();
            if (startGame.equals("yes")) {
                System.out.println("1v1 me in rock paper scissors");
            } else if (startGame.equals("no")) {
                System.out.println("squid game");
                return;
            } else {
                System.out.println("grrr");
            }

            System.out.println("rock, paper, or scissors?");
            String userChoice = scanner.nextLine();

            int random = (int) (Math.random() * 3) + 1;
            if (random == 1) {
                System.out.println("rock");
            } else if (random == 2) {
                System.out.println("paper");
            } else {
                System.out.println("scissors");
            }

            if (userChoice.equals("rock") && random == 3 || userChoice.equals("paper") && random == 1 || userChoice.equals("scissors") && random == 2) {
                wins++;
                System.out.println("you win \n" + "you have " + wins + " wins");
            } else if (userChoice.equals("rock") && random == 1 || userChoice.equals("paper") && random == 2 || userChoice.equals("scissors") && random == 3) {
                System.out.println("draw");
            } else if (userChoice.equals("rock") && random == 2 || userChoice.equals("paper") && random == 3 || userChoice.equals("scissors") && random == 1) {
                losses++;
                System.out.println("i win \n" + "you have " + losses + " losses");
            } else {
                losses++;
                System.out.println("you did not enter a valid object, i win by default hehehehaw \n" + "you have " + losses + " losses" );
            }

        }
        }

}
