import java.util.*;

class Katalog {
    Date tglUpdate;
    List<Buku> daftarBuku = new ArrayList<>();

    public List<Buku> cariBuku(String kriteria) {
        List<Buku> hasil = new ArrayList<>();
        for (Buku b : daftarBuku) {
            if (b.judul.contains(kriteria)) {
                hasil.add(b);
            }
        }
        return hasil;
    }
}