public class practice {
    public static void main(String[] args) {

        // All this is 1d array in java.
        //** Sum of array in java **

        int arr[] = {2,3,4,5,6};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Sum of array elements: " + sum);

        //** Maximum element in array **

        int arr1[] = {10,20,30,40,50};
        int max = arr1[0];
        for (int i=1; i<arr1.length; i++){
            if(arr1[i] > max){
                max = arr1[i];
            }
        }
        System.out.println("Maximum element in array: " + max);

        //** Minimum element in array **

        int arr2[] = {20,40,60,80,100};
        int min = arr2[0];

        for (int i=1; i<arr2.length; i++){
            if(arr2[i] < min){
                min = arr2[i];
            }
        }
        System.out.println("Minimum element in array: " + min);
    }
    
}
