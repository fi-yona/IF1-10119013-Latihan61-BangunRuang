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


public class Tabung extends BangunRuang{
    
    private final float r;
    private final float h;
    
    public Tabung(int r, int h){
        this.r = r;
        this.h = h;
    }
            
    @Override
    public float hitungVolume(){
        double volume = (Math.PI*Math.pow(r,2)*h);
        return (float) volume;
    }
}
