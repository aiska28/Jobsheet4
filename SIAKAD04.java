import java.util.Scanner;

public class SIAKAD04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim, nilaiHuruf = "", kualifikasi = "";
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
        
        System.out.println("Masukkan Nama: ");
        nama = sc.nextLine();
        System.out.println("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.println("Masukkan Kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.println("Masukkan Absen: ");
        absen = sc.nextByte();

        System.out.println("Masukkan Nilai Kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.println("Masukkan Nilai Tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.println("Masukkan Nilai Ujian: ");
        nilaiUjian = sc.nextDouble();
        System.out.println("Masukkan Nilai Akhir: ");
        nilaiAkhir = sc.nextDouble();
        System.out.println("Masukkan Nilai Akhir Huruf: ");
        nilaiAkhirHuruf = sc.nextDouble();
        System.out.println("Masukkan Kualifikasi: ");
        kualifikasi = sc.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        if (nilaiAkhir > 80){
            nilaiHuruf = "A ";
            kualifikasi = "Sangat Baik ";
        }else if(nilaiAkhir > 73){
            nilaiHuruf = "B+ ";
            kualifikasi = "Lebih Dari Baik ";
        }else if(nilaiAkhir > 60){
            nilaiHuruf = "B ";
            kualifikasi = "Baik ";
        }else if(nilaiAkhir = > 50){
            nilaiHuruf = "Lebih dari Cukup";
            kualifikasi = "c+ ";
        }else if(nilaiAkhir > 39){
            nilaiHuruf = "Kurang";
            kualifikasi = "D ";
        }else{
            nilaiHuruf = "gagal";
            kualifikasi = "E ";
        }
        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " absen " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Hurufnya " + nilaiHuruf);
        System.out.println("Kualifikasinya " + kualifikasi);

    }
}