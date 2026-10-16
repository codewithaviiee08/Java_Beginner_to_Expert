public class Smallest {
    public static void main(String[] args) {

        // Write a Java program to find the smallest element in an array of integers.
        // Create an array of integers.
        // 1D Array of smallest element in an array of integers

        int []  array = {10,25,5,35,45};
        int smallest = array[0];

        for(int i=1; i<array.length; i++){
            if (array[i]<smallest){
                smallest = array[i];
                
            }
        }
        System.out.println("Smallest number in the array: " +smallest);

        // Write a Java program to find the smallest element in an array of integers.
        // 2D Array of smallest element in an array of integers

        int [][] array1 = {

            {10,25,35},
            {55,65,15},
            {75,105,115}
        };

        int smallest1 = array1[0][0];
        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array1[i].length; j++){
                if (array1[i][j]<smallest1){
                    smallest1 = array1[i][j];
                }
            }
        }
        System.out.println("Smallest number in the 2D array: " + smallest1);
    }
    
}
