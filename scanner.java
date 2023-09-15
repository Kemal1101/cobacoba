import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tinggi badan (dalam cm): ");
        double tinggiBadan = input.nextDouble();

        System.out.print("Pilih jenis kelamin (pria/wanita): ");
        String jenisKelamin = input.next().toLowerCase();

        double beratBadanIdeal;

        if (jenisKelamin.equals("pria")) {
            beratBadanIdeal = (tinggiBadan - 100) - ((tinggiBadan - 100) * 0.1);
        } else if (jenisKelamin.equals("wanita")) {
            beratBadanIdeal = (tinggiBadan - 100) - ((tinggiBadan - 100) * 0.15);
        } else {
            System.out.println("Jenis kelamin yang dimasukkan tidak valid.");
            return;
        }

        System.out.println("Berat badan ideal Anda adalah: " + beratBadanIdeal + " kg");
    }
}
