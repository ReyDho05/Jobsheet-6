import java.util.Scanner;
/**
 * latihan3
 */
public class latihan3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ukuran,harga, tortal, kategori;
        String merk;
        System.out.println("========= Pembelian Sepatu =========");
        System.out.println("Merk yang anda ingin beli : ");
        merk=sc.nextLine().toLowerCase();
        switch (merk) {
            case "converse":
                System.out.println("Pilih Kategori Sepatu!");
                System.out.println("1. Slip On ");
                System.out.println("2. High Top ");
                System.out.print("Anda memilih (1/2): ");
                kategori = sc.nextInt();
                System.out.println("Masukkan Ukuran Sepatu Anda : ");
                ukuran = sc.nextInt();
                if (kategori==1) {
                    if ( ukuran>=36 && ukuran<=40) {
                        harga = 800000;
                        System.out.println("Sepatu dengan merk "+merk+" berukuran "+ukuran+"dipatok dengan harga "+harga);
                    } else {
                        System.out.println("Ukuran sepatu belum tersedia");
                        return;
                    } }
                else if (kategori==2){
                    if (ukuran>=40 && ukuran<=44)  {
                        harga=1200000;
                        System.out.println("Sepatu dengan merk "+merk+" berukuran "+ukuran+"dipatok dengan harga "+harga);
                    } else {
                        System.out.println("Ukuran sepatu belum tersedia");
                        return;
                    }
                }
                 else {
                    System.out.println("Input salah");
                    return;
                }
                break;
            case "sketcher":
            System.out.println("Pilih Kategori Sepatu!");
                System.out.println("1. Woman ");
                System.out.println("2. Man ");
                System.out.print("Anda memilih (1/2): ");
                kategori = sc.nextInt();
                System.out.println("Masukkan Ukuran Sepatu Anda : ");
                ukuran = sc.nextInt();
                if (kategori==1) {
                    if ( ukuran>=36 && ukuran<=41) {
                        harga = 1000000;
                        System.out.println("Sepatu dengan merk "+merk+" berukuran "+ukuran+"dipatok dengan harga "+harga);
                    } else {
                        System.out.println("Ukuran sepatu belum tersedia");
                        return;
                    } }
                else if (kategori==2){
                    if (ukuran>=41 && ukuran<=44)  {
                        harga=1800000;
                        System.out.println("Sepatu dengan merk "+merk+" berukuran "+ukuran+"dipatok dengan harga "+harga);
                    } else {
                        System.out.println("Ukuran sepatu belum tersedia");
                        return;
                    }
                }
                 else {
                    System.out.println("Input salah");
                    return;
                }
                break;
            case"nike":
            System.out.println("Pilih Kategori Sepatu!");
                System.out.println("1. Kids ");
                System.out.println("2. Adult ");
                System.out.print("Anda memilih (1/2): ");
                kategori = sc.nextInt();
                System.out.println("Masukkan Ukuran Sepatu Anda : ");
                ukuran = sc.nextInt();
                if (kategori==1) {
                    if ( ukuran>=36 && ukuran<=40) {
                        harga = 750000;
                        System.out.println("Sepatu dengan merk "+merk+" berukuran "+ukuran+"dipatok dengan harga "+harga);
                    } else {
                        System.out.println("Ukuran sepatu belum tersedia");
                        return;
                    } }
                else if (kategori==2){
                    if (ukuran>=40 && ukuran<=44)  {
                        harga=1500000;
                        System.out.println("Sepatu dengan merk "+merk+" berukuran "+ukuran+"dipatok dengan harga "+harga);
                    } else {
                        System.out.println("Ukuran sepatu belum tersedia");
                        return;
                    }
                }
                 else {
                    System.out.println("Input salah");
                    return;
                }
                break;
            default:
            System.out.println("Merk belum tersedia");
                break;
        } 
    }
}