/**
 *
 * @author AYP
 */
public class A {
    int x;
    int y;
    
    void TampilkanNilaiXY() {
        System.out.println("Nilai X : " + x +", Y : " + y);
    }
}

class B extends A { //Mendeklarasikan Class B yang diturunkan
    int z;          // dari Class A
    
    void TampilkanJumlah() {
        // subclass dapat mengakses member dari superclass
        System.out.println("Jumlah :" + (x+y+z));
    }
}

class Demo {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();
        
        System.out.println("SuperClass");
        superOb.x = 10;
        superOb.y = 20;
        superOb.TampilkanNilaiXY();
        
        System.out.println("SubClass");
        subOb.x = 5;
        subOb.y = 4;
        subOb.TampilkanNilaiXY();
        
        //member tambahan yang hanya ada pada subclass
        subOb.z = 50;
        subOb.TampilkanJumlah();
    }
}
