package programfilm;

/**
 * @author Abhinaya
 */

import java.util.Scanner;

public class FilmMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Film film = new Film();
        int pilih;

        do {
        System.out.println("===================================");
        System.out.println("====   DATA FILM LAYAR LEBAR   ====");
        System.out.println("===================================");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Indeks Tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Indeks Tertentu");
        System.out.println("7. Cetak Data");
        System.out.println("8. Cari by ID");
        System.out.println("9. Urut Data Rating Film-DSC");
        System.out.println("10. Keluar");
        System.out.println("===================================");
        System.out.print("Masukkan pilihan Anda : ");
        pilih = sc.nextInt();
        switch (pilih) {
            case 1:
            System.out.println("Masukkan Data Film Posisi Awal");
                System.out.print("ID Film\t\t\t: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Judul Film\t\t: ");
                String judul = sc.nextLine();
                System.out.print("Masukkan Rating Film\t: ");
                double rating = sc.nextDouble();  
                film.addFirst(id, judul, rating);
                break;
            case 2:
                System.out.println("Masukkan Data Film Posisi Akhir");
                System.out.print("ID Film\t\t\t: ");
                id = sc.nextInt();
                sc.nextLine();
                System.out.print("Judul Film\t\t: ");
                judul = sc.nextLine();
                System.out.print("Masukkan Rating Film\t: ");
                rating = sc.nextDouble();
                film.addLast(id, judul, rating);
                break;
            case 3:
                System.out.println("Masukkan Data Film Posisi Indeks Tertentu");
                System.out.println("Urutan ke -");
                System.out.print("ID Film\t\t\t: ");
                id = sc.nextInt();
                sc.nextLine();
                System.out.print("Judul Film\t\t: ");
                judul = sc.nextLine();
                System.out.print("Masukkan Rating Film\t: ");
                rating = sc.nextDouble();
                System.out.println("Data akan dimasukkan pada indeks ke : ");
                int index = sc.nextInt();
                film.insertAt(id, judul, rating, index);
                break;
            case 4:
                film.removeFirst();
                break;
            case 5:
                film.removeLast();
                break;
            case 6:
                System.out.println("Masukkan Indeks : ");
                index = sc.nextInt();
                film.removeAt(index);
                break;
            case 7:
                film.cetak();
                break;
            case 8:
                System.out.println("Cari Data");
                System.out.print("Masukkan ID yang dicari : ");
                id = sc.nextInt();
                System.out.println("Data ID : " + id + " ditemukan pada Node ke : " + film.cari(id));
                System.out.println("Identitas Film : ");
                film.cariData(id);
                break;
            case 9:
                film.urutkanData();
                break;
            case 10:
                System.out.println("Terima kasih telah menggunakan program ini");
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
                break;
        }
        } while (pilih != 10);
    }
}
