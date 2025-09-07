package Array;

public class RotationOfArray {

    public static void main(String[] args){
        int[] arr= {1,2,3,4,5};

        int[] rotated =  leftRotateByK(arr,3);

        // Print the result
        for (int num : rotated) {
            System.out.print(num + " ");
        }
    }

    static int[] leftRotateByK(int[] arr, int k){
        int n= arr.length;

        int temp[] = new int[2*n];
        int result[] = new int[n];

        for(int i=0;i<n;i++){
            temp[i]=arr[i];
            temp[i+n]=arr[i];

        }

        for(int i=0;i<n;i++){
            result[i] = temp[i+k];
        }

        return result;
    }
}
