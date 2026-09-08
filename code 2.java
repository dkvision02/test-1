import java.util.*;

public class JavaTest {

    static int calculateSum(int[] numbers) {
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        return sum;
    }

    static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== JAVA TEST PROGRAM =====");

        // Variables
        String name = "TestUser";
        int age = 21;
        double marks = 87.5;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);

        // Array
        int[] numbers = {10, 25, 7, 42, 18, 31, 9};

        System.out.println("\nArray Elements:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // Calculate sum
        int sum = calculateSum(numbers);

        System.out.println("\n\nSum = " + sum);
        System.out.println("Average = " + (double) sum / numbers.length);

        // Find largest number
        int largest = numbers[0];

        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("Largest Number = " + largest);

        // Prime number test
        System.out.print("\nEnter a number to test for prime: ");
        int input = scanner.nextInt();

        if (isPrime(input)) {
            System.out.println(input + " is a PRIME number.");
        } else {
            System.out.println(input + " is NOT a prime number.");
        }

        // Switch statement
        System.out.print("\nEnter a number from 1-3: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected ONE.");
                break;

            case 2:
                System.out.println("You selected TWO.");
                break;

            case 3:
                System.out.println("You selected THREE.");
                break;

            default:
                System.out.println("Invalid choice.");
        }

        // Random number
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        System.out.println("\nRandom Number: " + randomNumber);

        // String test
        String message = "Java Programming";

        System.out.println("String: " + message);
        System.out.println("Length: " + message.length());
        System.out.println("Uppercase: " + message.toUpperCase());
        System.out.println("Reversed:");

        for (int i = message.length() - 1; i >= 0; i--) {
            System.out.print(message.charAt(i));
        }

        System.out.println("\n\n===== TEST COMPLETED =====");

        scanner.close();
    }
}