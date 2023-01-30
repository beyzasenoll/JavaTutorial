import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SelectionSort selectionSort=new SelectionSort();
        int[] arr={6,3,0,1,6,12,4};
        System.out.println("----Selection Sort-----");
        selectionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}