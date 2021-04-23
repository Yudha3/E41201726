/**
 *
 * @author AYP
 * Overriding
 */
public class A2 {
    public void tampilkanKeLayar() {
        System.out.println("Method milik class A2 dipanggil");
    }
}

class B2 extends A2 {
    public void tampilkanKeLayar() {
        // Tambahan
        super.tampilkanKeLayar(); // Memanggil method milik dari superclassnya.
        System.out.println("Method milik class B2 dipanggil");
    }
}

class Demo2 {
    public static void main(String[] args) {
        B2 subOb = new B2();
        subOb.tampilkanKeLayar();
    }
}
