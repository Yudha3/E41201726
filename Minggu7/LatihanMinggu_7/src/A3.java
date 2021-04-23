/**
 *
 * @author AYP
 * Abstract
 */
public abstract class A3 { // Deklarasi Class
    abstract public void method2(); // Deklarasi method abstract.
    //method konkrit yang memiliki implementasi
    public void method1() {
        System.out.println("Method konkrit dari class A3");
    }
}

class B3 extends A3 {
    public void method2() { // Method abstract di-override dan di buat
        System.out.println("Method abstract yang sudah menjadi konkrit dalam class B3");
    }
}

class Demo3 {
    public static void main(String[] args) {
        B3 ob = new B3();
        ob.method1();
        ob.method2();
    }
}
