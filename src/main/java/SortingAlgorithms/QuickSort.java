package SortingAlgorithms;

public class QuickSort {

    public static void main(String[] args){
        int arr[] = {2, 6, 5, 3, 1, 4};
       quickSort(arr,0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    static void quickSort(int arr[],int l ,int h){
        if(l<h){
            int pivot = partition(arr,l,h);
            quickSort(arr,l,pivot-1);
            quickSort(arr,pivot+1,h);
        }
    }
    static int partition(int arr[],int l,int h){
        int pivot = arr[l];
        int i=l,j=h;
        while(i<=j){
            while (i <= h && arr[i] <= pivot) i++;
            while (j >= l && arr[j] > pivot) j--;
            if(i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[l];
        arr[l]=arr[j];
        arr[j]=temp;
        return j;
    }

}
