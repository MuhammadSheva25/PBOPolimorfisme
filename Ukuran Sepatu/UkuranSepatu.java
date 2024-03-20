public class UkuranSepatu {
    public void info() {
        System.out.println("Ukuran standar sepatu adalah 40");
    }
    
    public void info(String jenisKelamin) {
        if (jenisKelamin.equalsIgnoreCase("pria")) {
            System.out.println("Ukuran sepatu pria adalah 42");
        } else if (jenisKelamin.equalsIgnoreCase("wanita")) {
            System.out.println("Ukuran sepatu wanita adalah 38");
        } else {
            System.out.println("Mohon masukkan jenis kelamin yang valid (pria/wanita)");
        }
    }
}





