// Operator in java program.
public class operator {
    public static void main(String[] args) {
         //operators in java
         
         //2+3

         //arithmetic operators
         //+ - * / %
         int num=10;
         int num1=20;
         int sum=num+num1;
         System.out.println("Sum: " + sum);

         int sub=num1-num;
         System.out.println("Sub: " + sub);

         int product=num*num1;
         System.out.println("Product: " + product);

         int division=num1/num;
            System.out.println("Division: " + division);

            int modulus=num%num1;
            System.out.println("Modulus: " + modulus);

            // Airthmetic operators in java

            // + (Addition) - (Subtraction) * (Multiplication) / (Division) % (Modulus)

            int a = 10 + 5; // Addition
            int b = 10 - 5; // Subtraction
            int c = 10 * 5; // Multiplication
            int d = 10 / 5; // Division
            int e = 10 % 5; // Modulus

            System.out.println("Addition: " + a);
            System.out.println("Subtraction: " + b);
            System.out.println("Multiplication: " + c);
            System.out.println("Division: " + d);
            System.out.println("Modulus: " + e);

            //2. Relational operators in java.
            // == (Equal to) != (Not equal to) > (Greater than) < (Less than) >= (Greater than or equal to) <= (Less than or equal to)

            // Example of relational operators

            // == (Equal to) 5 == 5 // true
            // != (Not equal to) 5 != 5 // false
            // > (Greater than) 5 > 3 // true
            // < (Less than) 5 < 3 // false
            // >= (Greater than or equal to) 5 >= 3 // true         
            // <= (Less than or equal to) 5 <= 3 // false

            int x = 5;
            int y = 3;
            boolean isNotEqual = x != y; // isNotEqual will be true because 5 is not equal to 3
            System.out.println("Is Not Equal: " + isNotEqual);

            boolean isGreater = x > y; // isGreater will be true because 5 is greater than 3
            System.out.println("Is Greater: " + isGreater);

            boolean isLess = x < y; // isLess will be false because 5 is not less than 3
            System.out.println("Is Less: " + isLess);

            boolean isLessOrEqual = x <= y; // isLessOrEqual will be false because 5 is not less than or equal to 3
            System.out.println("Is Less or Equal: " + isLessOrEqual);

            boolean isGreaterOrEqual = x >= y; // isGreaterOrEqual will be true because 5 is greater than or equal to 3
            System.out.println("Is Greater or Equal: " + isGreaterOrEqual);

            //3. Logical operators in java.


            // && (Logical AND)
            // || (Logical OR)
            // ! (Logical NOT)

            boolean a1 = 10 > 5; // true
            boolean b1 = 5 < 3; // false
            boolean c1 = 5 == 3; // false
            
            
            boolean result1 = a1 && b1;
            boolean result2 = a1 || b1;
            boolean result3 = !c1;
            
            System.out.println("Logical AND: " + result1);
            System.out.println("Logical OR: " + result2);
            System.out.println("Logical NOT: " + result3);

            // 4. Assignment operators in java.
            // = (Assignment)
            // += (Add and assign)
            // -= (Subtract and assign)
            // *= (Multiply and assign)
            // /= (Divide and assign)
            // %= (Modulus and assign)

            int assignmentValue = 22; // Assignment
            assignmentValue += 5; // Add and assign
            assignmentValue -= 3; // Subtract and assign
            assignmentValue *= 2; // Multiply and assign
            assignmentValue /= 4; // Divide and assign
            assignmentValue %= 3; // Modulus and assign

            System.out.println("Assignment value after operations: " + assignmentValue);
            System.out.println("Add and assign: " + (22 + 5));
            System.out.println("Subtract and assign: " + (22 - 3));
            System.out.println("Multiply and assign: " + (22 * 2));
            System.out.println("Divide and assign: " + (22 / 4));
            System.out.println("Modulus and assign: " + (22 % 3));


            System.out.println("Final value of assignmentValue: " + assignmentValue);


        

    }
}