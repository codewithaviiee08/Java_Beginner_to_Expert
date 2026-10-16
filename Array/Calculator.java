public class Calculator {
    public static void main(String[] args){

        // This is a simple calculator program that adds two numbers.

        int a = 10;
        int b = 20;

        int sum = a + b;
        System.out.println("Sum: " + sum);

        // This is a simple calculator program that subtracts two numbers.

        int c = 30;
        int d = 40;

        int Sub = d - c;
        System.out.println("Subtraction: " + Sub);

        // This is a simple calculator program that multiplies two numbers.

        int e = 15;
        int f = 25;

        int Mul = e * f;
        System.out.println("Multiplication: " + Mul);

        // This is a simple calculator program that divides two numbers.

        int g = 12;
        int h = 8;

        int Div = g/h;
        System.out.println("Division: " + Div);

        // Calculate the average of array elements.

        int[] numbers = {16,45,75,65,85};

        int Sum1 = 0;

        for(int i = 0; i < numbers.length; i++){
            Sum1 += numbers[i];
            
        }

        float average =(float) Sum1 / numbers.length;
        System.out.println("Sum: " + Sum1);
        System.out.println("Average: " + average);
        
    }
    
}
