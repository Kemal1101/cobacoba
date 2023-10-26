import java.util.Scanner;
public class LatihanMandiriPertemuan9b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputan [] = new String [10];
        int i = 0, j = inputan.length;

        while (i < inputan.length){
            System.out.print("Masukkan Input: ");
            inputan [i] = sc.next();
            i++;
        }
        j--;
        while (j < inputan.length && j != -1){
            System.out.println(inputan[j]);
            j--;
        }
        
    }
}
