package com.tutorial;

class Mahasiswa{
    // Data Member
    String nama;
    String nim;
    String prodi;

    //construktor dengan parameter
    Mahasiswa (String nama,String nim,String prodi){
        this.nama = nama;
       this.nim = nim;
        this.prodi = prodi;
    }

    // method tanpa parameter dan tanpa return
    void show(){
        System.out.println("nama : " + this.nama);
        System.out.println("nim : " + this.nim);
        System.out.println("prodi : " + this.prodi);
    }


    // method tanpa return dengan parameter
    void setnama(String nama) {
        this.nama = nama;
    }

    // method dengan retrun tanpa parameter
    String getnama(){
        return this.nama;
    }

    // method dengan return dan parameter
    String devi(String pesan){
        return pesan + " Aku adalah " + this.nama;
    }
}

public class Main {

    public static void main(String[] args){
        // instansiasi objek
        Mahasiswa mhs1 = new Mahasiswa("faqita", "22241039",  "PTI");



        mhs1.show();
        mhs1.setnama("Devi"); 
        mhs1.show();
        System.out.println(mhs1.getnama());
        String pesan = mhs1.devi("hallo");
        System.out.println(pesan);

        
    }
    
    
}



    
