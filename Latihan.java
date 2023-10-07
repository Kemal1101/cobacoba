import java.util.Scanner;

public class Latihan {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int tahun;
        tahun = sc.nextInt(); 
        
      if ((tahun % 4) == 0) {
        if ((tahun % 100) != 0){
          System.out.println("tahun kabisat");
        }else {
          System.out.println("bukan tahun kabisat");
        }
      }else {
        System.out.println("bukan tahun kabisat");
      }
        
        



    }
}
