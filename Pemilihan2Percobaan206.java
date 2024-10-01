import java.util.Scanner;
public class Pemilihan2Percobaan206 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);
        int menu, harga=0, total=0;
        double diskon;
        String member,metode;
        System.out.println("-----------------------");
        System.out.println("==== Menu Kafe JTI ====");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        menu = input06.nextInt();
        input06.nextLine();
        System.out.print("Apakah punya member (y/n)?");
        member = input06.nextLine();
        System.out.println("Metode pembayaran (cash/qris)");
        metode= input06.nextLine().toLowerCase();
        if (member.equalsIgnoreCase("y")) {
        diskon = 0.10;
        System.out.println("Besar diskon "+ diskon);
            if (menu == 1) {
                harga=14000;
                System.out.println("Harga Rice Bowl : Rp "+harga);
            }else if (menu == 2 ){
                harga = 3000;
                System.out.println("Harga Ice Teh : Rp "+harga);
            }else if (menu==3){
                harga = 15000;
                System.out.println("Harga Bundling : Rp " +harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar ");
                return;  
            }
            switch (metode) {
                case "cash":
                total=(int) (harga-(harga*diskon));
                System.out.println("Total pembayaran setelah diskon adalah Rp "+total);
                    break;
                case "qris":
                total=(int) (harga-(harga*diskon)-1000);
                System.out.println("Total pembayaran setelah diskon adalah Rp "+total);
                default:
                    break;
            }
            }else if (member.equalsIgnoreCase("n")){
                if (menu==1) {
                harga= 14000;
                System.out.println("Harga Rice Bowl : Rp "+harga);
            }else if (menu == 2 ){
                harga = 3000;
                System.out.println("Harga Ice Teh : Rp "+harga);
            }else if (menu==3){
                harga = 15000;
                System.out.println("Harga Bundling : Rp " +harga);  
                switch (metode) {
                    case "cash":
                    System.out.println("Total pembayaran  adalah Rp "+harga);
                    break;
                case "qris":
                total=harga-1000;
                    System.out.println("Total pembayaran  adalah Rp "+total);
                    default:
                        break;
                } 
            } else {
                System.out.println("Masukkan pilihan menu dengan benar ");
                return;
            
            }
        } else {
            System.out.println("Member tidak valid ");
        }  System.out.println("--------------------------------------");
    
   }
}