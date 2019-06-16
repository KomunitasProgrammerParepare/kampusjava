public class BubbleSortTest {

    public static void main(String[] args) {
        int ukuran = 100;
        BubbleSort deret = new BubbleSort(ukuran);
        deret.tambah(23);
        deret.tambah(15);
        deret.tambah(45);
        deret.tambah(87);
        deret.tambah(0);
        deret.tambah(31);
        deret.tambah(15);

        System.out.println("Data awal");
        deret.bacaArr();
        deret.bublleSort();
        System.out.println("Hasil pengurutan = ");
        deret.bacaArr();
    }
}
