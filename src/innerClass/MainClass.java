package innerClass;

public class MainClass {
    public static void main(String[] args) {
        Mobil mobil = new Mobil(87654);
        System.out.println("Mulai Mobil");
        mobil.mulai();
    
        System.out.println("================");
        System.out.println("Biaya");
        Mobil.Bensin bensin = new Mobil.Bensin();
        bensin.biaya();
    }
}
