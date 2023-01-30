public class SelectionSort {
    void swap(int[] arr,int i,int j){

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    ;}

    void sort(int arr[]){
        int n=arr.length;

        for(int i=0; i<n-1 ; i++){
            int minInd=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minInd]){
                    minInd=j;
                }
            }
            swap(arr,minInd,i);
        }
    }
}
