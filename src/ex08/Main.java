package ex08;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {5, 2, 9, 1, 5, 6};
        int[] array2 = {3, 0, -1, 8, 7, 3};

        Sortable bubbleSort = new BubbleSort();
        Sortable quickSort = new QuickSort();

        bubbleSort.sort(array1);
        quickSort.sort(array2);

        System.out.println("BubbleSort Result:");
        for (int num : array1) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("QuickSort Result:");
        for (int num : array2) {
            System.out.print(num + " ");
        }
    }
}
