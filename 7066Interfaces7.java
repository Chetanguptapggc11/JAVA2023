interface Sortable{
    void sort(int[] array);
}
class BubbleSort implements Sortable {
    public void sort(int[] a) {
        for (int i = 0, n = a.length, temp; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (a[j] > a[j + 1]) { temp = a[j]; a[j] = a[j + 1]; a[j + 1] = temp; }
    }
}
class SelectionSort implements Sortable {
    public void sort(int[] a) {
        for (int i = 0, n = a.length, min, temp; i < n - 1; i++) {
            min = i;
            for (int j = i + 1; j < n; j++)
                if (a[j] < a[min]) min = j;
            temp = a[i]; a[i] = a[min]; a[min] = temp;
        }
    }
}
public class SortableInterface{
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        Sortable bubbleSort = new BubbleSort();
        bubbleSort.sort(array);
        System.out.println("BubbleSort: " + java.util.Arrays.toString(array));
        array = new int[]{64, 25, 12, 22, 11};
        Sortable selectionSort = new SelectionSort();
        selectionSort.sort(array);
        System.out.println("SelectionSort: " + java.util.Arrays.toString(array));
    }
}