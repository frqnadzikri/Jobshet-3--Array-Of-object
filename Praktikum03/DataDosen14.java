package praktikum03;
public class DataDosen14 {

    void dataSemuaDosen(Dosen14[] arrayOfDosen){
        for(Dosen14 d : arrayOfDosen){
            d.tampilInformasi();
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen14[] arrayOfDosen){
        int pria = 0;
        int wanita = 0;

        for(Dosen14 d : arrayOfDosen){
            if(d.jenisKelamin){
                pria++;
            }else{
                wanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen14[] arrayOfDosen){
        int totalPria = 0, totalWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for(Dosen14 d : arrayOfDosen){
            if(d.jenisKelamin){
                totalPria += d.usia;
                jmlPria++;
            }else{
                totalWanita += d.usia;
                jmlWanita++;
            }
        }

        System.out.println("Rata-rata usia dosen pria : " + (totalPria/jmlPria));
        System.out.println("Rata-rata usia dosen wanita : " + (totalWanita/jmlWanita));
    }

    void infoDosenPalingTua(Dosen14[] arrayOfDosen){
        Dosen14 tertua = arrayOfDosen[0];

        for(Dosen14 d : arrayOfDosen){
            if(d.usia > tertua.usia){
                tertua = d;
            }
        }

        System.out.println("Dosen Paling Tua");
        tertua.tampilInformasi();
    }

    void infoDosenPalingMuda(Dosen14[] arrayOfDosen){
        Dosen14 termuda = arrayOfDosen[0];

        for(Dosen14 d : arrayOfDosen){
            if(d.usia < termuda.usia){
                termuda = d;
            }
        }

        System.out.println("Dosen Paling Muda");
        termuda.tampilInformasi();
    }
}