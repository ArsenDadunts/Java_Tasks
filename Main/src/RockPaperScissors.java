import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println("The Game up to 5.\nPlease select the option\n1) Rock  2) Paper 3) Scissor");
        while (userPoints<5 || computerPoints<5){
        gameRockPaperScissors();
    }
    }

    private static int userPoints = 0, computerPoints = 0;

    private static void gameRockPaperScissors() {
        if (userPoints == 5) {
            System.out.println("You win!!!!");
            System.exit(0);
        } else if (computerPoints == 5) {
            System.out.println("You lost((((");
            System.exit(0);
        }
        List<String> list = new ArrayList<>();
        list.add("Rock");
        list.add("Paper");
        list.add("Scissors");
        System.out.println("User: ");
        Scanner scanner = new Scanner(System.in);
        String user = scanner.next();
        if (user.equals("Scissors") || user.equals("Paper") || user.equals("Rock")) {

            String result = getRandomElement(list);
            if (result.equals("Rock") && user.equals("Paper") || result.equals("Paper") && user.equals("Scissors") || result.equals("Scissors") && user.equals("Rock")) {
                System.out.println("Computer: \n" + result);
                userPoints++;
                System.out.println("The user points is: " + userPoints + "\nThe computer points is: " + computerPoints);
            } else if (result.equals("Paper") && user.equals("Rock") || result.equals("Scissors") && user.equals("Paper") || result.equals("Rock") && user.equals("Scissors")) {
                System.out.println("Computer: \n" + result);

                computerPoints++;
                System.out.println("The user points is: " + userPoints + "\nThe computer points is: " + computerPoints);
            } else {
                System.out.println("Computer: \n" + result);
                System.out.println("The user points is: " + userPoints + "\nThe computer points is: " + computerPoints);
            }
        } else {
            System.out.println("Invalid command");
            gameRockPaperScissors();
        }
    }

    public static String getRandomElement(List<String> list) {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}
