/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lingkaran;

/**
 *
 * @author LENOVO
 */
public class LingkaranBeraksi {
    public static void main(String[] args) {
        double r = 11.78;

        Lingkaran lingkaran = new Lingkaran();
        double luas = lingkaran.hitungLuas(r);

        // Tampilkan hasil dalam tiga bentuk
        System.out.println("Luas sebagai bilangan pecahan: " + luas);
        System.out.println("Luas sebagai bilangan bulat (type-casting): " + (int)luas);
        System.out.println("Luas setelah pembulatan (rounding): " + Math.round(luas));
    }
}
