import java.util.Scanner;
public class latihan1 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);
    int bil1, bil2, bil3, terbesar;
    System.out.print("Masukkan Angka Pertama : ");
    bil1=input06.nextInt();
    System.out.print("Masukkan Angka Kedua : ");
    bil2=input06.nextInt();
    System.out.print("Masukkan Angka Ketiga : ");
    bil3=input06.nextInt();
    if (bil1>bil2) {
        if (bil1>bil3) {
            terbesar = bil1;
        } else {
            terbesar = bil3;
        } 
    } else {
        if (bil2>bil3) {
            terbesar = bil2;
        } else {
            terbesar = bil3;
        }
       System.out.println("Angka Terbesar Adalah " + terbesar); 
    }
    }
}