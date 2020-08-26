public class Insertion {
    public int[] insertionSort(int[] pZuSortieren) {
        int temp;
        for (int i = 1; i < pZuSortieren.length; i++) {
            temp = pZuSortieren[i];
            int j = i;
            while (j > 0 && pZuSortieren[j - 1] > temp){
                pZuSortieren[j] = pZuSortieren[j - 1];
                j--;
            }
            pZuSortieren[j] = temp;
        }
        return pZuSortieren;
    }
}
