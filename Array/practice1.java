public class practice1 {
    public static void main(String[] args){

        // 2d array in java.
        // ** Sum of 2d array in java **

        int arr3 [][] = {

            {1,2,3},
            {4,5,6},
            {7,8,9}

        };

        System.out.println(arr3[1][2]);

        int sum = 0;
        for(int i=0; i<3; i++){
            for(int j=0;j<3; j++){
                sum += arr3[i][j];
            }
        }
        System.out.println("Sum of 2d array elements: " + sum);


    }
    
}
