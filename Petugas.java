class Petugas {
    String idPetugas;
    String nama;
    String jabatan;

    public Petugas(String idPetugas, String nama, String jabatan) {
        this.idPetugas = idPetugas;
        this.nama = nama;
        this.jabatan = jabatan;
    }

    public void login() {
        System.out.println(nama + " login sebagai petugas" + jabatan);
    }

    public void tambahAnggota(Anggota a, Perpustakaan p) {
        p.daftarAnggota.add(a);
    }

    public void tambahBuku(Buku b, Perpustakaan p) {
        p.katalog.daftarBuku.add(b);
    }

    public void hapusBuku(Buku b, Perpustakaan p) {
        p.katalog.daftarBuku.remove(b);
    }

    public void prosesPeminjaman(Anggota a, Buku b) {
        a.riwayatPinjam.add(b);
        System.out.println("Admin: " + nama + " | " + a.nama + " meminjam buku " + b.judul);
    }

    public void prosesPengembalian(Anggota a, Buku b) {
        System.out.println("Admin: " + nama + " | " + a.nama + " mengembalikan buku " + b.judul);
    }
}