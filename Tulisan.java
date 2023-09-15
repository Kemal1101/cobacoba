import java.util.Scanner;

public class Tulisan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float tinggiBadan;
        String jenisKelamin;
        
        System.out.println("*****BERAT BADAN IDEAL ANDA*****");
        
        System.out.print("Masukkan Tinggi Badan (cm): ");
        tinggiBadan = sc.nextFloat();

        System.out.print("Jenis Kelamin Anda\n \"L\" untuk Pria \"P\" untuk Perempuan: ");
        jenisKelamin = sc.next().toUpperCase();

        double beratbadanIdeal;

        if (jenisKelamin.equals("L") ) {
            beratbadanIdeal = ((tinggiBadan - 100) - (tinggiBadan - 100) * 0.1);
        } else if (jenisKelamin.equals("P")) {
            beratbadanIdeal = ((tinggiBadan - 100) - (tinggiBadan - 100) * 0.15);
        } else {
            System.out.println("Seng Genah Woiiiiii");
            return;
        }

        System.out.println("Berat Badan Ideal Anda Adalah (kg): " + beratbadanIdeal);

       




    }
}
    
