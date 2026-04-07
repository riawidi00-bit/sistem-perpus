class Buku {
    String idBuku;
    String judul;
    String penulis;
    String isbn;

    public Buku(String idBuku, String judul, String penulis, String isbn) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.isbn = isbn;
    }

    public String getInfo() {
        return judul + " oleh " + penulis;
    }
}