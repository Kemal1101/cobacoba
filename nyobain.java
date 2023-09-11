import java.util.Scanner;

public class nyobain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*Menghitung keliling dan Luas Persegi Panjang*");

        System.out.print("Suku Pertama: ");
        int a = input.nextInt();

        System.out.print("Beda Baris: ");
        int b = input.nextInt ();

        System.out.print("Suku ke Berapa?: ");
        int n = input.nextInt();
        int Hasil = n - 1;
        int Hasil_1 = Hasil * b;
        int Hasil_2 = Hasil_1 + a;

        System.out.println("Hasilnya adalah: " + Hasil_2);
        
        input.close();
    }
}
