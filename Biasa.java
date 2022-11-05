public class Biasa extends Permintaan {
    protected int harga;
    protected int ukuran;

    public Biasa(String kd_per){
        super(kd_per);
    }

    @Override
    public void Mentahan(){
        System.out.println(" 1. < 3x3 m, 5000");
        System.out.println(" 2. 3x3 m, 10000");
        System.out.println(" 3. >1x1 m, >20000");
    }

    @Override
    public int total(int harga, int ukuran){
        return harga * ukuran;
    }
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getUkuran() {
        return ukuran;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }
}
