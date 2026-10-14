public class Array {
    public static void main(String[] args) {
        
        /* Array is used to store multiple values in a single variable, instead of declaring separate variables for each value. 

        array index start from 0 to n-1, where n is the size of the array.

        Size = cout of values in the array.

        datatype[] arrayName = new datatype[size];
        
        */

        int arr[] = {1,2,3,4,5,10};

        System.out.println(arr[5]);

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        
    }
    
}
