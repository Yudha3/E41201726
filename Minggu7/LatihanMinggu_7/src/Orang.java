/**
 *
 * @author AYP
 */
public class Orang {
    private String nama;
    private double tinggi;
    private double berat;
    
    public Orang (String nama, double tinggi, double berat) {
        this.nama = nama;
        this.tinggi = tinggi;
        this.berat = berat;
    }
    
    public String toString() {
        return ("Nama : "+nama+"\nTinggi :"+ tinggi + "\nBerat : "+berat);
    }
}

class Pelajar extends Orang {
    private String nim;
    private String asalSekolah;
    private double nilai; // range : 0-30
    
    public Pelajar(String nama, double tinggi, double berat, String nim, 
            String sekolah, double nilai) {
        super(nama, tinggi, berat);
        this.nim = nim;
        asalSekolah = sekolah;
        this.nilai = nilai;
    }
    
    public String toString() {
        return (super.toString()+"\nNIM :"+nim+"\nSekolah :"+asalSekolah+
                "\nNilai :"+nilai);
    }
}

class Test {
    public static void main(String[] args) {
        Pelajar mahasiswa = new Pelajar("Lukman", 172, 75, "1010651098",
                                        "UM JEMBER", 98.8);
        System.out.println(mahasiswa.toString());
    }
}
