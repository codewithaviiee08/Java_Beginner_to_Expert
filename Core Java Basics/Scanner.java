// Age input program using Scanner class
public class Scanner {
    public static void main(String[] arys) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            System.out.println("Enter your name: ");
            String name = sc.nextLine();
            System.out.println("Hello, " + name + "!");

            System.out.println("Enter your age: ");
            int age = sc.nextInt();
            System.out.println("You are " + age + " years old.");
        }
    }
}