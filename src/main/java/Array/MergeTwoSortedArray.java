package Array;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {

        int[] arr1 ={1,3,5,7,11,12};
        int[] arr2 ={2,4,6,8,9,10};
        int merge[] = mergeArray(arr1,arr2);
        System.out.println(Arrays.toString(merge));
    }
    static int[] mergeTwoArray(int arr1[],int arr2[]){
        int m= arr1.length;
        int n= arr2.length;

        int result[] = new int[m+n];
        int k=0;

        for (int i=0;i<m;i++){
            result[i] = arr1[i];
        }
         for (int j=0;j<n;j++){
            result[m+j] = arr2[j];
        }
       Arrays.sort(result);
         return result;

    }

    static int[] mergeArray(int arr1[],int arr2[]){
        int m= arr1.length;
        int n= arr2.length;

        int result[] = new int[m+n];
        int i=0,j=0, k=0;

        while(i<m && j<n){
            if(arr1[i] <= arr2[j]){
                result[k] = arr1[i];
                i++;
            }else{
                result[k] = arr2[j];
                j++;

            }
            k++;
        }
        while (i < n) {
            result[k] = arr1[i];
            i++;
            k++;
        }
        while (j < m) {
            result[k] = arr2[j];
            j++;
            k++;
        }

        return result;

    }
}
