import java.util.Scanner;
public class iseng {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        for (int i = 10 ; i >= 0  ;i--){
            for (int j = 0 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0 ; i <= 10  ; i++){
            for(int k = 0 ; k < 10 - i ; k++){
                System.out.print(" ");
            }
            for (int j = 0 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }






        
}
}
