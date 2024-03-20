public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        SmartphoneLayarSentuh smartphoneLayarSentuh = new SmartphoneLayarSentuh();

        smartphone.info("Samsung");
        smartphone.info("Apple", "iPhone 12");
        smartphoneLayarSentuh.info("Xiaomi", "Redmi Note 10");
    }
}