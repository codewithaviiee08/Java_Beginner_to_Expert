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

        // 2d Array in Java.
        // ** Max of 2d array in java **

        int arr4 [][] = {

            {1,2,3},
            {4,5,6},
            {7,8,9}

        };

        int max = arr4[1][2];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(arr4[i][j] > max){
                    max = arr4[i][j];
                }
            }
        }

        System.out.println("Max of 2d array elements: " +max);


    }
    
}
