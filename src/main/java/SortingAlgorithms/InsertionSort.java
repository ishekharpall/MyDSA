package SortingAlgorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {2, 6, 5, 3, 1, 4};
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    static void insertionSort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int last = arr[i];
            int swapNo = i-1;
            while(swapNo >=0 && arr[swapNo]>last){
                swapNo--;
            }
            int j=i;
            while(j>swapNo+1){
                arr[j]=arr[j-1];
                j--;
            }
            arr[swapNo+1] = last;
        }

    }

}
