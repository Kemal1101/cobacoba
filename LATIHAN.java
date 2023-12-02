import java.util.Scanner;

public class LATIHAN {
    static float investasi (int tahun, float uang, float total){
        if (tahun >= 1){
             total += total * 0.117;
             return (investasi(tahun - 1, uang, total)); 
        }else {
            return (total); 
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan uang yang anda tabung ke emas: ");
        float uang = sc.nextFloat();
        float total = uang;
        System.out.print("Masukkan berapa tahun anda ingin menabung: ");
        int tahun = sc.nextInt();

        System.out.print("Total uang anda adalah " + investasi(tahun, uang, total));
    }
}