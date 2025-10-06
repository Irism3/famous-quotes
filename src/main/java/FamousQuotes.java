import java.util.Scanner;

public class FamousQuotes {

    public static void main(String[] args) {

        //creating an array of strings to store 3 quotes.

        String[] quotes = {"Everything happens for a reason.", "Life is short. Smile while you still have teeth.", "Stick to the plan, not your mood."};
        //prompt the user to select between 1 or 3, and I have to make it display the quote

        Scanner myScanner = new Scanner(System.in);

        boolean valid = false;
        do {
            System.out.print("Select a quote(1, 2, or 3): ");
            int choice = myScanner.nextInt();

            try {
                System.out.println(quotes[choice - 1]);
                valid = true;
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println(ex);
                valid = false;
            }

        } while (!valid);
        myScanner.close();
    }
}
