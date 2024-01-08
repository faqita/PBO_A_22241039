package com.tutorial;

// Kelas Induk atau Superclass
class BangunDatar {
    public float hitungLuas() {
        return 0;
    }

    public float hitungKeliling() {
        return 0;
    }
}

// Subclass Persegi
class Persegi extends BangunDatar {
    private float sisi;

    public Persegi(float sisi) {
        this.sisi = sisi;
    }

    @Override
    public float hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public float hitungKeliling() {
        return 4 * sisi;
    }

    public void display() {
        System.out.println("Persegi dengan sisi: " + sisi);
    }
}

// Subclass Lingkaran
class Lingkaran extends BangunDatar {
    private float jariJari;
    private final float PI = 3.14f;

    public Lingkaran(float jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public float hitungLuas() {
        return PI * jariJari * jariJari;
    }

    @Override
    public float hitungKeliling() {
        return 2 * PI * jariJari;
    }

    public void display() {
        System.out.println("Lingkaran dengan jari-jari: " + jariJari);
    }
}

// Subclass Persegi Panjang
class PersegiPanjang extends BangunDatar {
    private float panjang;
    private float lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public float hitungLuas() {
        return panjang * lebar;
    }

    @Override
    public float hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public void display() {
        System.out.println("Persegi Panjang dengan panjang: " + panjang + " dan lebar: " + lebar);
    }
}

// Subclass Segitiga
class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;
    private float sisi1;
    private float sisi2;
    private float sisi3;

    public Segitiga(float alas, float tinggi, float sisi1, float sisi2, float sisi3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    @Override
    public float hitungLuas() {
        return 0.5f * alas * tinggi;
    }

    @Override
    public float hitungKeliling() {
        return sisi1 + sisi2 + sisi3;
    }

    public void display() {
        System.out.println("Segitiga dengan alas: " + alas + ", tinggi: " + tinggi +
                ", dan panjang sisi-sisi: " + sisi1 + ", " + sisi2 + ", " + sisi3);
    }
}

public class Main {
    public static void main(String[] args) {
        // Menggunakan class Persegi
        Persegi persegi = new Persegi(5);
        persegi.display();
        System.out.println("Luas Persegi: " + persegi.hitungLuas());
        System.out.println("Keliling Persegi: " + persegi.hitungKeliling());
        System.out.println();

        // Menggunakan class Lingkaran
        Lingkaran lingkaran = new Lingkaran(70);
        lingkaran.display();
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling());
        System.out.println();

        // Menggunakan class Persegi Panjang
        PersegiPanjang persegiPanjang = new PersegiPanjang(14, 22);
        persegiPanjang.display();
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.hitungLuas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.hitungKeliling());
        System.out.println();

        // Menggunakan class Segitiga
        Segitiga segitiga = new Segitiga(12, 9, 7, 10, 16);
        segitiga.display();
        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
        System.out.println("Keliling Segitiga: " + segitiga.hitungKeliling());
    }
}

