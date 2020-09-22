public class Main {

    public static void main(String[] args) {
        Insertion sort = new Insertion();
        int[] arr = {5, 3453, 7, 9, 13, -20, -3, 256, 1024, -3675, -9999, 656, -56, 64597, -234567};
        for (int i = 0; i < arr.length; i++)
            System.out.print(sort.insertionSort(arr)[i] + "   ");
    }
}
