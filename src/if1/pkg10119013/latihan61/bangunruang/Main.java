/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan61.bangunruang;

/**
 *
 * @author Fiona Avila
 */


public class Main {

    public static void main(String[] args) {
        Bola b = new Bola(7);
        System.out.printf("Volume bola\t= %.1f%n", b.hitungVolume());
        
        Tabung t = new Tabung(10,21);
        System.out.printf("Volume tabung\t= %.1f%n", t.hitungVolume());
        
        Kerucut k = new Kerucut(14,9);
        System.out.printf("Volume kerucut\t= %.0f%n", k.hitungVolume());
        
        System.out.println();
        System.out.println("by. Fiona Avila");
    }
    
}
