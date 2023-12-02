    import java.util.Scanner;
    public class scanner {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            String konfirm;
            do{    
                int jumlah = 1;
                for (int i = sc.nextInt() ; i > 0 ; i--){
                    jumlah *= i;
                    if (i == 1){
                        break;
                    }
                }
                System.out.println(jumlah);
                System.out.print("Konfirmasi: ");
                konfirm = sc.next();
            }while (!konfirm.equalsIgnoreCase("y"));
        }
    }