import java.util.ArrayList;

import static java.util.Collections.swap;

public class SortingAlgorithms {
    public static void doSelectionSort(ArrayList<Integer> arrayList){
        int count=0;
        int n=arrayList.size();
        for(int i=0;i<n-1;i++){
            int pos=i;
            for(int j=i+1;j<n;j++){
                if(arrayList.get(j)<arrayList.get(pos)){
                    pos=j;
                }
            }
            int min = arrayList.get(pos);
            arrayList.set(pos, arrayList.get(i));
            arrayList.set(i, min);
            count++;
        }
        System.out.println("count is "+count);
        print(arrayList);
    }
    public static void doInsertionSort(ArrayList<Integer> arrayList){
        int count=0;
        int n=arrayList.size();
        for(int j=1;j<n;j++){
            int key=arrayList.get(j);
            int i=j-1;

            while(i>=0 && arrayList.get(i) > key){
                arrayList.set(i+1,arrayList.get(i));
                i--;
            }
            arrayList.set(i+1,key);
            count++;
        }

        System.out.println("count is "+count);
        print(arrayList);
    }

    //optimized bubble sort
    public static void doBubbleSort(ArrayList<Integer> arrayList) {
        int count = 0;
        boolean swapped = false;
        int n = arrayList.size();
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arrayList.get(j) > arrayList.get(j + 1)) {
                    swap(arrayList, j, j + 1);
                    swapped = true;
                }
                if (!swapped) {
                    break;
                }
            }
            count++;
        }
        System.out.println("count is " + count);
        print(arrayList);
    }
    public static void print(ArrayList<Integer> array){
        for(int i=0;i<array.size();i++){
            System.out.println(array.get(i) + " ");
        }
    }
}
