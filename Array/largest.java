public class largest {
    public static void main(String[] args){

        // find the largest number in 1d array in java.

        int arr5 [] = {1,2,3,4,5,6,7,8,9};
        int largest = arr5[0];
        for(int i=1; i<9; i++){
            if(arr5[i] > largest){
                largest = arr5[i];
            }
        }
        System.out.println("Largest number in the array: " + largest);

    }
    
}
 