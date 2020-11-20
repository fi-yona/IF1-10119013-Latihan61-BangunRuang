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


public class Bola extends BangunRuang{
    
    private final float r;
    
    public Bola(int r){
        this.r = r;
    }
    
    @Override
    public float hitungVolume() {
        double volume = (1.33333333333*Math.PI*Math.pow(r,3));
        return (float) volume;
    }
}
