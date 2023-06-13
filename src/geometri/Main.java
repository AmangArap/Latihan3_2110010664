/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometri;

/**
 *
 * @author asus
 */
public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(5.0);
        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling());
        
        PersegiPanjang persegiPanjang = new PersegiPanjang(4.0, 6.0);
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.luas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.keliling());
    }
}
