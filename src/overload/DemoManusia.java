package overload;

public class DemoManusia {
    public static void main(String args[]){
        //class manusia static, tidak perlu buat object
		Manusia.nama = "Hendro";
		Manusia.jenkel = "Laki - laki";
        Manusia.cetak();
        
        Manusia.nama = "Hendri";
		Manusia.jenkel = "Laki - laki";
		Manusia.cetak();
	}
}
