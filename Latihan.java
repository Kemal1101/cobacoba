import java.util.Scanner;

public class Latihan {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String identitasPemesan, layananTambahan, tanggalPelaksanaanAcara,
        tanggalPemesanan, jenisGedung;

        int  jumlahTamu;
        int kapasitasGedung[] ;

        //INPUT
        System.out.println("SEWA GEDUNG UNTUK PERNIKAHAN");

        System.out.print("Masukkan Nama : ");
        identitasPemesan = input.nextLine();

        System.out.print("Masukkan Tanggal : ");
        tanggalPemesanan = input.nextLine();

        System.out.print("Tanggal Pelaksanaan Acara : ");
        tanggalPelaksanaanAcara = input.nextLine();
        

         System.out.print("Jumlah Tamu Undangan:\n Gedung A = 100 - 200\n Gedung B = 200 - 300\n Gedung C = 300 - 400\n Masukkan Jumlah Tamu:  ");
        jumlahTamu = input.nextInt();

        jenisGedung = (jumlahTamu <= 200)? "Gedung A" : "Gedung B";
        jenisGedung = (jumlahTamu <= 300)? "Gedung B" : "Gedung C";
        jenisGedung = (jumlahTamu <= 400)? "Gedung C" : "Gedung D";


        

       if (jumlahTamu <=200) {
    System.out.println("Anda akan menggunakan Gedung A");
       } else if (200 <= jumlahTamu && jumlahTamu <=300 ) {
        System.out.println("Anda akan menggunakan Gedung B");
       }else if (300<= jumlahTamu && jumlahTamu <= 400) {
        System.out.println("Anda akan menggunakan Gedung C");
       } else {
        System.out.println("Yang bener masukin tamunya woi");
       }



        System.out.print("Layanan Tambahan : ");
        layananTambahan = input.next();

        boolean pemesananBerhasil = true;
        //OUTPUT
        if (pemesananBerhasil) {
            System.out.println("------ Pemesanan Telah Berhasil------");
            System.out.println("Nama Pemesan :" + identitasPemesan);
            System.out.println("Tanggal Pemesanan :" + tanggalPemesanan);
            System.out.println("Tanggal Pelaksanaan Acara :" + tanggalPelaksanaanAcara);
            System.out.println("Jumlah Tamu Undangan :" + jumlahTamu);
            System.out.println("Jenis Gedung : " + jenisGedung );
            System.out.println("Layanan Tambahan: " + layananTambahan);
        } else {
            System.out.println("Maaf, Pemesanan yang anda minta tidak dapat kami proses. Silahkan coba lagi nanti.");

        }
        //CLOSING SCANNER
        input.close();
    }
}
