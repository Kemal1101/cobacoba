    import java.util.Scanner;

    public class scanner {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            int bil, i = 0, j = 0, k = 0;
            int sisa [] = new int[100];
            int hasilBagi [] = new int[100];

            System.out.print("Masukkan Bilangan Desimal: ");
            bil = sc.nextInt();

            sisa [0] = (bil % 2);
            hasilBagi [0] = (bil - sisa[i]) / 2;
            
            while ((i < sisa.length - 1) && hasilBagi [i] != 0){
            sisa [i + 1] = (hasilBagi [i] % 2);
            hasilBagi [i + 1] = (hasilBagi[i] - sisa[i + 1]) / 2;
            i++;
            k++;
            }

            while (k != -1){
                System.out.print(sisa[k]);
                k--;
            }
     }
    }
        
    
