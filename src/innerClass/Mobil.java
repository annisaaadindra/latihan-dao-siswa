package innerClass;

public class Mobil {
    private int nomor;

    public Mobil(int nomor) {
        this.nomor = nomor;
    }

    private class Mesin {
        public void hidup() {
            System.out.println("Mesin " + nomor + " hidup");
        }
    }

    public static class Bensin {
        public void biaya() {
            System.out.println("Biaya untuk isi bensin ");
        }
    }

    public void mulai() {
        System.out.println("Menyalakan mobil " + nomor);

        Mesin mesin = new Mesin();
        mesin.hidup();

        String merk = "BMW";

        class Data {
            public void tampilData() {
                System.out.println("Nomor: " + nomor);
                System.out.println("Merk: " + merk);
            }
        }

        Data data = new Data();
        data.tampilData();
    }
}
