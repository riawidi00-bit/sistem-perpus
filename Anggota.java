import java.util.*;
import java.util.ArrayList;

class Anggota {
    String idAnggota;
    String nama;
    String alamat;
    List<Buku> riwayatPinjam = new ArrayList<>();

    public Anggota(String idAnggota, String nama, String alamat) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.alamat = alamat;
    }

    public void login() {
        System.out.println(nama + " login");
    }

    public List<Buku> getRiwayatPinjam() {
        return riwayatPinjam;
    }
}