import java.util.Scanner;
// User Input in Java
public class UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1;

        System.out.println("Enter first number: ");
        num1 = sc.nextInt();

        System.out.println("You entered: " + num1);

        float num2;

        System.out.println("Enter second number: ");
        num2 = sc.nextFloat();

        System.out.println("You entered: " + num2);

    }
}
