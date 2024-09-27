import java.util.Scanner;

public class kafe04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;
        
        System.out.println("Masukkan menu: ");
        menu = sc.nextLine();
        System.out.println("Masukkan ukuran cup: ");
        ukuranCup = sc.next().charAt(0);
        System.out.println("Masukkan jumlah: ");
        jumlah = sc.nextInt();
        System.out.println("Masukkan keanggotaan (true/false): ");
        keanggotaan = sc.nextBoolean();
        
        double hargaMenu = 0;

        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;
        }

        double totalHarga = hargaMenu + jumlah;

        switch (ukuranCup) {
            case 'S':
                break;
            case 'M':
                totalHarga += 0.25 * totalHarga;
                break;
            case 'L':
                totalHarga += 0.4 * totalHarga;
                break;
            default:
                totalHarga = 0 * totalHarga;
                System.out.println("the selected size" + ukuranCup + "is not available");
                break;
        }

        double diskon = keanggotaan ? 0.1 : 0;
        double nominalBayar = totalHarga - ( diskon * totalHarga);

        System.out.println("Item pembelian: " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
        System.out.println("Nomial bayar: " + nominalBayar);
    }
}