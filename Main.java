import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Perpustakaan p = new Perpustakaan("Perpus Baca Buku Bjir", "Kota Gianyar");

        Petugas petugas = new Petugas("P01", "Gusrama", "Admin");
        Anggota anggota = new Anggota("A01", "Wisnu", "Desa Beng,Gianyar");

        Buku buku = new Buku("NovelJapan", "Otonari no tenshi sama", "Saekisan", "978-623-8957-61-3");
        Buku buku1 = new Buku("MangaJapan", "Classroom of the elite", "Syougo Kinugasa", "911-221-1632-11-1");
        Buku buku2 = new Buku("ManhwaKorea", "Solo leveling", "Jang Sung-Rak", "908-983-6723-77-5");
        Buku buku3 = new Buku("NovelKorea", "The villain of destiny", "Urban Madman", "877-543-1972-88-2");
        
        // tambah data
        petugas.tambahAnggota(anggota, p);
        petugas.tambahBuku(buku, p);
        petugas.tambahBuku(buku1, p);
        petugas.tambahBuku(buku2, p);
        petugas.tambahBuku(buku3, p);

        Scanner input = new Scanner(System.in);

        while (true) {

            // tampil buku
            System.out.println("\n==============================");
            System.out.println("Buku yang tersedia");
            System.out.println("==============================");

            for (Buku b : p.getKatalog().daftarBuku) {
                System.out.println("- " + b.judul);
            }

            // menu
            System.out.println("\nPilih Menu:");
            System.out.println("1. Pinjam Buku");
            System.out.println("2. Kembalikan Buku");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = input.nextInt();
            input.nextLine();

            // keluar
            if (pilihan == 3) {
                System.out.println("Program selesai.");
                break;
            }

            System.out.print("Masukkan nama buku: ");
            String namaBuku = input.nextLine();

            // cari buku
            Buku bukuDipilih = null;

            for (Buku b : p.getKatalog().daftarBuku) {
                if (b.judul.equalsIgnoreCase(namaBuku)) {
                    bukuDipilih = b;
                    break;
                }
            }

            // proses
            if (bukuDipilih != null) {
                if (pilihan == 1) {
                    petugas.prosesPeminjaman(anggota, bukuDipilih);
                } else if (pilihan == 2) {
                    petugas.prosesPengembalian(anggota, bukuDipilih);
                } else {
                    System.out.println("Pilihan tidak valid!");
                }
            } else {
                System.out.println("Buku tidak ditemukan!");
            }
        }
    }
}