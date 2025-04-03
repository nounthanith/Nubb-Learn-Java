import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean playAgain = false;
        do {
            System.out.println("1 = ខ្លា >> 2 = ឃ្លោក >> 3 = មាន់ >> 4 = បង្កង >> 5 = ក្តាម >> 6 = ត្រី");
            System.out.print("Please input number: ");

            int num = scanner.nextInt();

            System.out.println("========================");

            if (num < 1 || num > 6) {
                System.out.println("Number is only 1-6");
                System.out.println("========================");
                continue; // Skip the rest of the loop and ask again
            }

            int dice = (int) (Math.random() * 6) + 1;

            System.out.print("Your prediction is: " + num + " ");
            printAnimal(num);

            System.out.println("========================");
            System.out.print("Answer: " + dice + " ");
            printAnimal(dice);

            System.out.println("========================");

            if (num == dice) {
                System.out.println("You win 😂😂");
            } else {
                System.out.println("You lose 😪😪");
            }

            System.out.println("========================");
            System.out.print("Do you want to play again? (yes/no): ");
            scanner.nextLine(); // Consume newline
            String response = scanner.nextLine().toLowerCase();
            playAgain = response.equals("y");

        } while (playAgain);

        System.out.println("Thanks for playing! Goodbye!");
        scanner.close();
    }

    public static void printAnimal(int num) {
        switch (num) {
            case 1 -> System.out.println("ខ្លា");
            case 2 -> System.out.println("ឃ្លោក");
            case 3 -> System.out.println("មាន់");
            case 4 -> System.out.println("បង្កង");
            case 5 -> System.out.println("ក្តាម");
            case 6 -> System.out.println("ត្រី");
            default -> System.out.println("None");
        }
    }
}
