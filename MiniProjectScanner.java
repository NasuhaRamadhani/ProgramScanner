package miniprojectscanner;

import java.util.Scanner;
public class MiniProjectScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("SELAMAT DATANG DI TOKO LEGGOMXSHOP");
        System.out.println("Jika ingin memesan, silahkan mengisi format pemesanan dibawah ini!");
        System.out.println("=================================================================");
        
        System.out.print("Nama Pemesan : ");
        String unit1 = sc.nextLine();

        System.out.print("Alamat Pengiriman : ");
        String unit2 = sc.nextLine();
  
        System.out.print("Barang yang dipesan : ");
        String unit3 = sc.nextLine();

        System.out.print("Pengiriman Melalui : ");
        String unit4 = sc.nextLine();
        
        System.out.print("Diskon Belanja : ");
        int unit5 = sc.nextInt();
        
        System.out.print("Nomor HP : ");
        long unit6 = sc.nextLong();
       
        System.out.println("");
        System.out.println("============================================");
        System.out.println("Terima Kasih Telah Berbelanja di LEGGOMXSHOP");
        System.out.println("Berikut adalah format pemesanan anda");
        System.out.println("============================================");
        System.out.println("");
        
        System.out.println("Nama Pemesan : " + unit1);
        System.out.println("Nomor HP : " + unit6);
        System.out.println("Alamat Pengiriman : " + unit2); 
        System.out.println("Barang yang dipesan : " + unit3);
        System.out.println("Pengiriman melalui : " + unit4);
        System.out.println("Diskon belanja : " + unit5 + "%");
    }  
}
