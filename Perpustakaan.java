import java.util.*;
import java.util.ArrayList;

class Perpustakaan {
    String nama;
    String alamat;
    Katalog katalog = new Katalog();
    List<Anggota> daftarAnggota = new ArrayList<>();
    List<Petugas> daftarPetugas = new ArrayList<>();

    public Perpustakaan(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public Katalog getKatalog() {
        return katalog;
    }

    public List<Anggota> getDaftarAnggota() {
        return daftarAnggota;
    }

    public List<Petugas> getDaftarPetugas() {
        return daftarPetugas;
    }
}