package inheritance;

public class DemoSenjata {
   public static void main(String[] args) {
    Senjata s = new Senjata();
	Prajurit p = new Prajurit();
    p.setSenjata(s);
    p.menembak();//dor
    
	s = new M16();
	p.setSenjata(s);
	p.menembak();//ttrrr

   }
}
