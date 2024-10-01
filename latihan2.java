import java.util.Scanner;
public class latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah,harga;
        double diskon=0;
        String jenis;
        System.out.println("Selamat datang di Toko Buku!");
        System.out.print("Silahkan masukan jenis buku : ");
        jenis=sc.nextLine().toLowerCase();
        System.out.print("Jumlah pembelian : ");
        jumlah=sc.nextInt();
        if (jenis.equalsIgnoreCase("kamus")) {
            if (jumlah>2) {
                diskon = 0.12;
            } else {
                diskon = 0.1;}}
        else if (jenis.equalsIgnoreCase("novel")){
            if (jumlah>3) {
                diskon=0.09;
            } else {
                diskon = 0.08; }}
        else {
            if (jumlah>3) {
                diskon= 0.05;
            } else {
                diskon = 0;}
        } System.out.println("Selamat anda mendapat diskon sebesar "+diskon+"%");
    }
}