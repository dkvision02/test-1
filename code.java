import java.util.*;

public class RandomJavaTest {

    static class Student {
        String name;
        int age;
        double marks;

        Student(String name, int age, double marks) {
            this.name = name;
            this.age = age;
            this.marks = marks;
        }

        void display() {
            System.out.println(
                "Name: " + name +
                ", Age: " + age +
                ", Marks: " + marks
            );
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Java Testing Program ===");

        // Variables
        int number = 25;
        String message = "Hello Java!";
        boolean active = true;

        System.out.println(message);
        System.out.println("Number: " + number);
        System.out.println("Active: " + active);

        // Array
        int[] numbers = {42, 17, 89, 3, 56, 21, 74};

        System.out.println("\nOriginal Array:");
        System.out.println(Arrays.toString(numbers));

        // Find maximum and minimum
        int max = numbers[0];
        int min = numbers[0];

        for (int n : numbers) {
            if (n > max) max = n;
            if (n < min) min = n;
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        // Sorting
        Arrays.sort(numbers);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(numbers));

        // Random number
        Random random = new Random();

        System.out.println("\nRandom Numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.println(random.nextInt(100));
        }

        // Student objects
        Student[] students = {
            new Student("Rahul", 20, 78.5),
            new Student("Aman", 21, 91.2),
            new Student("Priya", 19, 84.7)
        };

        System.out.println("\nStudent Details:");

        for (Student student : students) {
            student.display();
        }

        // Exception handling
        try {
            int result = 100 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("\nException caught: " + e.getMessage());
        }

        // Simple calculation
        int a = 15;
        int b = 10;

        System.out.println("\nCalculations:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + ((double) a / b));

        System.out.println("\n=== Test Completed ===");
    }
}