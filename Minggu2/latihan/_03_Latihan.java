
package latihan;

class buku {
    String judul;
    int jumlah;
    
    public void setInfoBuku(String judul, int jumlah) {
        
        this.judul = judul;
        this.jumlah = jumlah;
        
    }
    
    public void showInfoBuku() {
        
        System.out.println("Informasi Buku");
        System.out.println("Judul buku\t: " + judul);
        System.out.println("Jumlah buku\t: " + jumlah);
        
    }
    
}

public class _03_Latihan {
    public static void main(String[] args) {
        
        buku b1 = new buku();
        b1.setInfoBuku("Kolase", 20);
        b1.showInfoBuku();
        
    }
}
