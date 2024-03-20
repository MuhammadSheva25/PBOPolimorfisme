public class Main {
    public static void main(String[] args) {
        Kalkulator kalkulator1 = new Kalkulator();
        KalkulatorPintar kalkulator2 = new KalkulatorPintar();
        
        System.out.println("Hasil penjumlahan: " + kalkulator1.jumlah(2, 3));
        System.out.println("Hasil penjumlahan: " + kalkulator1.jumlah(2, 3, 4));
        System.out.println("Hasil penjumlahan: " + kalkulator2.jumlah(2, 3, 4));
    }
}