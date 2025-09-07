package SortingAlgorithms;

public class MergeSort {

    public static void main(String[] args) {
        int arr[] = {2, 6, 5, 3, 1, 4};
        mergeSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    static void mergeSort(int arr[],int l, int h){
        if(l<h) {
            int m = (l + h + 1) / 2;
            mergeSort(arr, l, m - 1);
            mergeSort(arr, m, h);
            merge(arr, l, m, h);
        }

    }
    static void merge(int arr[],int l,int m,int h){

        int n1=m-l;
        int n2=h-m+1;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for(int i=l;i<m;i++){L[i-l] = arr[i];}
        for(int i=m;i<=h;i++){R[i-m] = arr[i];}

        int i=0 ,j=0,k=l;
        while(i<n1 && j<n2){
            if(L[i]<R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i<n1){ arr[k]=L[i]; i++;k++;}
        while(j<n2){ arr[k]=R[j]; j++;k++;}
    }
}
