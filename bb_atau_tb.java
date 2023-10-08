import java.util.Scanner;
public class bb_atau_tb{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        String jenisKelamin, ygMaudiInput;
        float tinggiBadan, bbIdeal, beratBadan, ttBadan;
        

        System.out.println("~Penghitung Berat Badan Ideal~\n");

        System.out.print("\"t\" untuk tinggi badan\n\"b\" untuk berat badan\nAnda Mau Menginput Berat Badan atau Tinggi Badan: ");
        ygMaudiInput = sc.next().toLowerCase();
        while (!ygMaudiInput.equalsIgnoreCase("t") && !ygMaudiInput.equals("b" )) {
            System.out.println("Input yang Anda masukkan salah. Mohon ulangi.");
            System.out.print("\"t\" untuk tinggi badan\n\"b\" untuk berat badan\nAnda Mau Menginput Berat Badan atau Tinggi Badan: ");            
            ygMaudiInput = sc.next().toLowerCase();
        }

        if(ygMaudiInput.equalsIgnoreCase("t")){
           System.out.print("Masukkan Tinggi Badan Anda : " );
        tinggiBadan = sc.nextFloat();
        while (tinggiBadan < 100){
            System.out.println("Input yang Anda masukkan salah. Mohon ulangi.");
             System.out.print("Masukkan Tinggi Badan Anda : ");
             tinggiBadan = sc.nextFloat();
            }
        System.out.print("\"P\" untuk Perempuan\n\"L\" untuk Laki-Laki\n Masukkan Jenis Kelamin Anda: ");
        jenisKelamin = sc.next().toUpperCase();
        while (!(jenisKelamin.equalsIgnoreCase("l")) && !(jenisKelamin.equalsIgnoreCase("p"))) {
            System.out.println("Input yang Anda masukkan salah. Mohon ulangi.");
            System.out.print("\"P\" untuk Perempuan\n\"L\" untuk Laki-Laki\n Masukkan Jenis Kelamin Anda: ");
            jenisKelamin = sc.next().toUpperCase();
        }

            if (jenisKelamin.equalsIgnoreCase("L")) {
            bbIdeal = (tinggiBadan - 100) - (tinggiBadan - 100) * 0.1F;
            }else if (jenisKelamin.equals("P")){
            bbIdeal = (tinggiBadan - 100) - (tinggiBadan - 100) * 0.15F;
            }else {
            System.out.println("Yang Bener"); return;
            } 
            System.out.println("_______________________\n");
            System.out.println("Berat Badan Ideal Anda Adalah: " + bbIdeal + "kg");
        
        }else if (ygMaudiInput.equalsIgnoreCase("b")){
            System.out.print("Masukkan Berat Badan Anda: ");
            beratBadan = sc.nextFloat();
            
            System.out.print("\"P\" untuk Perempuan\n\"L\" untuk Laki-Laki\n Masukkan Jenis Kelamin Anda: ");
                    jenisKelamin = sc.next().toLowerCase();
            while(!(jenisKelamin.equalsIgnoreCase("l")) && !(jenisKelamin.equalsIgnoreCase("p"))){
                 System.out.println("Input yang Anda masukkan salah. Mohon ulangi.");
                 System.out.print("\"P\" untuk Perempuan\n\"L\" untuk Laki-Laki\n Masukkan Jenis Kelamin Anda: ");
                 jenisKelamin = sc.next().toLowerCase();
            }
            if (jenisKelamin.equals("l")){
                ttBadan = 100 + beratBadan / 0.9F;
            }else if (jenisKelamin.equals("p")){
                ttBadan = 100 + beratBadan / 0.85F;
            }else {
                System.out.println("Masukkan Yang Bener!"); return;
            }
             System.out.println("_______________________\n");
             System.out.println("Tinggi Badan Ideal Anda Seharusnya Adalah: " + ttBadan + "cm");
        }else {
            System.out.println("Masukkan yang Benerrr"); return;
        }
        
        

        sc.close();
    }
}
