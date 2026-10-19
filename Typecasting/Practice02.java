public class Practice02 {
    public static void main(String[] args){
        
        /*
         * Explicit Typecasting: Manual conversion of larger data type to smaller data type.
         * This is done by placing the  desired data type in parentheses before the value to be converted.
         * We can also use explicit typecasting to convert between compatible data types,
         * such as converting a double to an int or a float to a long.
         */

        // Explicit Typecasting Example.

        double num1 = 10.5;
        int num2 = (int) num1; // Explicit typecasting from double to int.

        System.out.println("num1:" +num1);
        System.out.println("num2:" +num2);
    }
    
}
