import java.util.Scanner;

public class DosenDemo14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int n = sc.nextInt();
        sc.nextLine();

        Dosen14[] arrayOfDosen = new Dosen14[n];

        for(int i=0;i<n;i++){
            System.out.println("Masukkan Data Dosen ke-"+(i+1));

            System.out.print("Kode : ");
            String kode = sc.nextLine();

            System.out.print("Nama : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (P/L) : ");
            String jk = sc.nextLine();

            boolean jenisKelamin;

            if(jk.equalsIgnoreCase("L")){
                jenisKelamin = true;
            }else{
                jenisKelamin = false;
            }

            System.out.print("Usia : ");
            int usia = sc.nextInt();
            sc.nextLine();

            arrayOfDosen[i] = new Dosen14(kode,nama,jenisKelamin,usia);
        }

        DataDosen14 data = new DataDosen14();

        System.out.println("\nDATA SEMUA DOSEN");
        data.dataSemuaDosen(arrayOfDosen);

        data.jumlahDosenPerJenisKelamin(arrayOfDosen);

        data.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);

        data.infoDosenPalingTua(arrayOfDosen);

        data.infoDosenPalingMuda(arrayOfDosen);

    }
}