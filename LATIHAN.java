import java.util.Scanner;

public class LATIHAN {
    static int tambah (int n){
        if (n <= 1){
            return (n);
        }else{
            return tambah(n -1) + tambah(n-2);
        }
        
    }    
    public static void main(String[] args) {
        int n = 12;
        for (int i = 0 ; i <= n ; i++){
            System.out.print(tambah(i) + " ");
        }
    }
    
}