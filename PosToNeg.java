import java.util.Scanner;

public class PosOrNeg {
    public static void main(String[] args) {

        Scanner userInputScan = new Scanner(System.in);

        String userInput;
        int userInt = 0;
        do {
            System.out.print("Please, enter number: ");
            userInput = userInputScan.nextLine();
            boolean verifiedUserInput = UtilityNum.isNumeric(userInput);


            if (verifiedUserInput) {
                userInt = Integer.parseInt(userInput);
                if (userInt > 0) {
                    System.out.println("You should approach life as your number; be positive.");
                } else if (userInt < 0) {
                    System.out.println("Negative. Yes, like the answer to \"Can I be sad today?\".");
                } else {
                    System.out.println("Try again, your number can't be a 0.");
                }
            } else {
                System.out.println("You wrote a number, didn't you? You don't want to break the code.");
            }


        } while (userInt == 0);
    }
}
