package com.tutorial;

class Pegawai {
    String Nama;
    float gajipokok;

    void display() {
        System.out.println("Nama Pegawai:" + this.Nama);
        System.out.println("Gaji Pokok:" + this.gajipokok);

    }
}

class PegawaiTetap extends Pegawai {
    float durasi_lembur;

    float Tunjangan(){
        return (float) 0.7d * gajipokok;
    }

    float Lembur(){
        return durasi_lembur * (float) (0.1d * this.gajipokok);
    }
    float GajiBersih(){
        return this.gajipokok + Tunjangan() + Lembur();
    }

    @Override
    void display(){
        super.display();
        System.out.println("Durasi Lembur:" + this.durasi_lembur);
        System.out.println("Tunjangan:" + Tunjangan());
        System.out.println("Gaji Bersih:" + GajiBersih());
    }
}

class PegawaiTidakTetap extends Pegawai{
    float durasi_Lembur;

    float Lembur(){
        return durasi_Lembur * (float) (0.05d * gajipokok);
    }

    float GajiBersih(){
        return gajipokok + Lembur();
    }

    @Override 
    void display(){
        super.display();
        System.out.println("Durasi Lembur:" + this.durasi_Lembur);
        System.out.println("Gaji Besih:" + GajiBersih());
    }
}

public class Main {

    public static void main(String[] args){

        PegawaiTetap PegawaiTetap = new PegawaiTetap();
        PegawaiTetap.Nama = "Faqita Zagena";
        PegawaiTetap.durasi_lembur = 7;
        PegawaiTetap.gajipokok = 3500000;
        PegawaiTetap.display();

        PegawaiTidakTetap PegawaiTidakTetap = new PegawaiTidakTetap();
        PegawaiTidakTetap.Nama = "Faqita Zagena";
        PegawaiTidakTetap.durasi_Lembur = 7;
        PegawaiTidakTetap.gajipokok = 3500000;
        PegawaiTidakTetap.display();
    }
}
