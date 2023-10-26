import java.util.Scanner;
public class LatihanMandiriPertemuan9d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bilanganBulat [] = new int [8];
        int i = 0, total = 0;
        float ratarata;

        while(i < bilanganBulat.length){
            System.out.print("Masukkan Angka: ");
            bilanganBulat[i] = sc.nextInt();
            total += bilanganBulat[i];
            i++;
        }
        ratarata = total / bilanganBulat.length;
        System.out.print("Rata rata dari angka - angka tersebut adalah: " + ratarata);


            }
        }
