package programvaksin;

/**
 * @author Abhinaya
 */

import java.util.Scanner;

public class VaksinMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vaksin vaksin = new Vaksin();
        String nama;
        int pilih, nomorAntrian;

        do {
            System.out.println("======================================");
            System.out.println("===  PENGANTRI VAKSIN EXTRAVAGANZA ===");
            System.out.println("======================================");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("--------------------------------------");
                    System.out.println("---  Masukkan Data Penerima Vaksin ---");
                    System.out.println("--------------------------------------");
                    System.out.print("Nomor Antrian : ");
                    nomorAntrian = sc.nextInt();
                    System.out.print("Nama Penerima : ");
                    nama = sc.next();
                    vaksin.Enqueue(nomorAntrian, nama);

                    break;
                case 2:
                    vaksin.Dequeue();
                    break;
                case 3:
                    vaksin.cetak();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan kami");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
        } while (pilih != 4);
    }
}
