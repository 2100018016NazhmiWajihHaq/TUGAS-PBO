public class Permintaan {
    String kd_per;

    public int total(int harga, int ukuran ){
        System.out.println("-");
        return 0;
    }
    public void Biasa(){
        System.out.println("Anda akan menjahit sobekan biasa");
    }
    public void Mentahan(){
        System.out.println("Anda akan membuat pakaian dari bahan mentahan");
    }
    public Permintaan(String kd_per){
        this.kd_per = kd_per;
    }

    public String getKd_per() {
        return kd_per;
    }

    public void setKd_per(String kd_per) {
        this.kd_per = kd_per;
    }
}
