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


public class Kerucut extends BangunRuang{
    
    private final float r;
    private final float t;
    
    public Kerucut(int r, int t){
        this.r = r;
        this.t = t;
    }
    
    @Override
    public float hitungVolume() {
        double volume = (0.33333333333*Math.PI*Math.pow(r,2)*t);
        return (float) volume;
    }
}
