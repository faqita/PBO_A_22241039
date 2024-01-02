package com.tutorial;

class Karyawan{
    public String nama;
    public String jabatan;
    public float pajak;
    public float gajipokok;
    private float gajibersih;

    Karyawan(String nama, String jabatan, float pajak, float gajipokok){
        this.nama = nama;
        this.jabatan = jabatan;
        this.pajak = pajak/100;
        this.gajipokok = gajipokok;

    }
    public float setPajak(float pajak){
        return this.pajak = pajak/100;
        
    }
    public float getgajibersih(){
        return this.gajipokok -(this.gajipokok*this.pajak);

    }
    public void display(){
        System.out.println("Nama Pegawai :" + this.nama);
        System.out.println("jabatan : " + this.jabatan);
        System.out.println("Gaji bersih : " + this.getgajibersih());
    }
}

public class Main {
    public static void main(String[] args) {
        Karyawan Gaji = new Karyawan("Faqita zagena", "sales", 10, 2500000);
        Gaji.display();
       
    } 
}
