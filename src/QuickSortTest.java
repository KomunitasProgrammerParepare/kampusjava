public class QuickSortTest {
    public static void main(String[] args) {
        int ukuran = 10;
        QuickSort qs = new QuickSort(ukuran);
        for (int i = 0; i < ukuran; i++) {
            long n = (int) (Math.random() * 99);
            qs.tambah(n);
        }
        qs.tampil();
        qs.quickSort();
        qs.tampil();
    }
}
