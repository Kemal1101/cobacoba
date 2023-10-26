import java.util.Scanner;
public class nyobain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Mahasiswa");

        int jumlahMahasiswa;
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        jumlahMahasiswa = sc.nextInt();

        String namaMahasiswa, jenisKelamin;
        String namaLaki [] = new String[jumlahMahasiswa];
        String namaPerempuan [] = new String[jumlahMahasiswa];
        int m = 0, jumlahPerempuan = 0, jumlahLaki = 0;
        while(m < jumlahMahasiswa){
            System.out.print("Masukkan Nama Mahasiswa: ");
            namaMahasiswa = sc.next();
            System.out.print("Masukkan Jenis Kelamin\n\"p\" untuk Perempuan\n\"l\" untuk Laki-Laki: ");
            jenisKelamin = sc.next();
            if(jenisKelamin.equalsIgnoreCase("l")){
                namaLaki [jumlahLaki] = namaMahasiswa;
                jumlahLaki++;
            }else if (jenisKelamin.equalsIgnoreCase("p")){
                namaPerempuan [jumlahPerempuan] = namaMahasiswa;
                jumlahPerempuan++;
            }
            m++;
        }
        System.out.println("Daftar Nama Mahasiswa");
        System.out.println("Mahasiswa Laki-Laki: ");
        int i = 0, j = 1;
        while(i < jumlahLaki){
            System.out.println(j + "." + " " + namaLaki[i]);
            i++;
            j++;
        }
        System.out.println("Mahasiswa Perempuan: ");
        int k = 0, l = 1;
        while(k < jumlahPerempuan){
            System.out.println(l + "." + " " + namaPerempuan[k]);
            k++;
            l++;
        }
    }
}
