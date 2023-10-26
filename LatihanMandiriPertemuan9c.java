import java.util.Scanner;
public class LatihanMandiriPertemuan9c{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        String namaBulan [] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        int i;

        System.out.print("Masukkan Angka: ");
        i = sc.nextInt();
        System.out.println(namaBulan[i - 1]);
    }
}
