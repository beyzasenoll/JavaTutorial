import java.util.ArrayList;
import static java.util.Collections.swap;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> array= new ArrayList<>();
         array.add(30);
         array.add(8);
         array.add(5);
         array.add(25);
         array.add(25);

        SortingAlgorithms sorting=new SortingAlgorithms();
        sorting.doSelectionSort(array);
        sorting.doInsertionSort(array);
        sorting.doBubbleSort(array);

    }
}