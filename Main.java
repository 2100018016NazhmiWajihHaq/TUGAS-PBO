import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String id;
        String namacus;
        String alamat;
        String idba;
        String namaba;
        String jenisba;
        Customer cst = new Customer();
        Scanner Customer = new Scanner(System.in);
        System.out.println("=====Customer=====");
        System.out.println("Masukkan ID Customer = ");
        id = Customer.nextLine();
        System.out.println("Masukkan NAMA = ");
        namacus = Customer.nextLine();
        System.out.println("Masukkan ALAMAT = ");
        alamat = Customer.nextLine();

        Bahan bhn = new Bahan();
        Scanner Bahan = new Scanner(System.in);
        System.out.println("=====Bahan=====");
        System.out.println("Masukan ID Bahan = ");
        idba = Bahan.nextLine();
        System.out.println("Masukkan NAMA Bahan = ");
        namaba = Bahan.nextLine();
        System.out.println("Masukkan Jenis Bahan = ");
        jenisba = Bahan.nextLine();

        System.out.println("==========DATA CUSTOMER===========");
        System.out.println("ID Customer = " +id);
        System.out.println("Nama Customer = " +namacus);
        System.out.println("Alamat Customer : " +alamat);

        System.out.println("==========DATA BAHAN===========");
        System.out.println("ID Bahan = " +idba);
        System.out.println("Nama Bahan = " +namaba);
        System.out.println("Jenis Bahan = " +jenisba);

        Permintaan cek = new Permintaan("1,2");
        Scanner Permintaan = new Scanner(System.in);

        Permintaan cek1 = new Permintaan("1");
        Mentahan mn = new Mentahan("1");
        Scanner Mentahan = new Scanner(System.in);
        System.out.println("Daftar pilihan = "+cek1.getKd_per());
        cek1.Mentahan();
        System.out.println("Pilihlah Permintaan Sesuai Dengan Yang Anda Inginkan = ");

        Permintaan cek2 = new Permintaan("2");
        Biasa bs = new Biasa("2");
        Scanner Biasa = new Scanner(System.in);
        System.out.println("Daftar pilihan = "+cek2.getKd_per());
        cek1.Mentahan();
        System.out.println("Pilihlah Permintaan Sesuai Dengan Yang Anda Inginkan = ");
    }
}