public class BubbleSort {
    private long[] arr;
    private int jmlData;

    public BubbleSort(int max) {
        arr = new long[max];
        jmlData = 0;
    }

    public void tambah(long nilai) {
        arr[jmlData] = nilai;
        jmlData++;
    }

    public void bacaArr() {
        for (int i = 0; i < jmlData; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("");
    }

    public void tukar(int a, int b) {
        long temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void bublleSort() {
        for (int i = jmlData - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    tukar(j, j + 1);
                    System.out.println("langkah pengurutan ke " + (-(i - jmlData)));
                    bacaArr();
                }
            }
        }
    }
}
