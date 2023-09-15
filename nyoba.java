import java.util.Scanner;

public class nyoba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Daftar jenis gedung beserta kapasitasnya
        String[] jenisGedung = {"Gedung A", "Gedung B", "Gedung C"};
        int[] kapasitasGedung = {100, 200, 300};
        
        System.out.println("Selamat datang di layanan sewa gedung!");
        
        // Meminta input jumlah tamu
        System.out.print("Masukkan jumlah tamu: ");
        int jumlahTamu = input.nextInt();
        
        // Mencari jenis gedung yang sesuai
        String gedungYangCukup = null;
        for (int i = 0; i < jenisGedung.length; i++) {
            if (kapasitasGedung[i] >= jumlahTamu) {
                gedungYangCukup = jenisGedung[i];
                break;
            }
        }
        
        // Menampilkan hasil
        if (gedungYangCukup != null) {
            System.out.println("Jenis gedung yang cukup untuk " + jumlahTamu + " tamu adalah: " + gedungYangCukup);
        } else {
            System.out.println("Maaf, tidak ada gedung yang cukup untuk " + jumlahTamu + " tamu.");
        }
        
        input.close();
    }
}


        
        


    


