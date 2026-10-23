public class Practice02 {
    public static void main(String[] args) {

        // String lenghth() method is used to get the length of a string.

        String text = "Abhijeet";

        int length = text.length();

        System.out.println("Length of the string: " + length);

        // String charAt() method is used to get the character at a specific index in a string.
        // charAt method takes an integer index as an argument and returns the character at that index.

        char character = text.charAt(5);
        System.out.println("Character at index 5: " + character);

        // String substring() method is used to extract a portion of a string.
        // substring method takes two integer arguments, the starting index and the ending index (exclusive), and returns a new string that contains the characters from the original string between those indices.

        String substring = text.substring(2, 6);
        System.out.println("Substring from index 2 to 6: " + substring);

        // String toUpperCase() method is used to convert all the characters in a string to uppercase.

        String upperCase = text.toUpperCase();
        System.out.println("Uppercase string: " + upperCase);

        // String toLowerCase() method is used to convert all the characters in a string to lowercase.


    }
}