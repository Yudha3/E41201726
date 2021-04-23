/**
 *
 * @author AYP
 * Konstruktor
 */
public class A1 {
    A1(String param1) { // super(); Tambahan secara otomatis oleh Java untuk memanggil
           //          Konstruktor dari SuperClassnya
           
        //super(); // Konstruktor default dari class
                 // Object dipanggil
        System.out.println("Konstruktor class A1 dengan Parameter " + param1 + " dieksekusi ...");
    }
}

class B1 extends A1 {
    B1() { // super(); Tambahan secara otomatis oleh Java untuk memanggil
           //          Konstruktor dari SuperClassnya
           
        super("test"); //Tambahan // Konstruktor default dari class A1
                 // Object dipanggil
        System.out.println("Konstruktor class B1 dieksekusi ...");
    }
}

class C1 extends B1 {
    C1() { // super(); Tambahan secara otomatis oleh Java untuk memanggil
           //          Konstruktor dari SuperClassnya
           
        super(); // Konstruktor default dari class B1
                 // Object dipanggil
        System.out.println("Konstruktor class C1 dieksekusi ...");
    }
}

class Demo1 {
    public static void main(String[] args) {
        B1 subOb = new B1();
        //C1 subOb = new C1();
    }
}
