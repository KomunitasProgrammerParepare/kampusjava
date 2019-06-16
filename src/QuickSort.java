public class QuickSort {
    private long[] arr;
    private int jmlData;

    public QuickSort(int max) {
        arr = new long[max];
        jmlData = 0;
    }

    public void tambah(long nilai) {
        arr[jmlData] = nilai;
        jmlData++;
    }

    public void tampil() {
        System.out.println("A =");
        for (int i = 0; i < jmlData; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("");
    }

    public void tukar(int indek1, int indek2) {
        long temp = arr[indek1];
        arr[indek1] = arr[indek2];
        arr[indek2] = temp;
    }

    public int partisiArr(int kiri, int kanan, long pivot) {
        int ptrKiri = kiri - 1;
        int ptrKanan = kanan;
        while (true){
            while (arr[++ptrKiri] < pivot){
            }
            while (ptrKanan > 0 && arr[--ptrKanan] > pivot){
            }
            if (ptrKiri >= ptrKanan){
                break;
            } else {
                tukar(ptrKiri, ptrKanan);
            }
        }
        tukar(ptrKiri, kanan);
        return ptrKiri;
    }

    public void reQuickSort(int kiri, int kanan){
        if (kanan - kiri <= 0){
            return;
        } else {
            long pivot = arr[kanan];
            int partisi = partisiArr(kiri, kanan, pivot);
            reQuickSort(kiri, partisi - 1);
            reQuickSort(partisi + 1, kanan);
        }
    }

    public void quickSort(){
        reQuickSort(0, jmlData-1);
    }
}
