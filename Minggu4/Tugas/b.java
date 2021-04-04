/**
 *
 * @author asusAYP
 */
public class b {
    public static void main(String[] args){

    System.out.println("          Do_While");
    System.out.println("Bilangan Kelipatan 2 (0-100)");
    System.out.println("============================");
     
    int kelipatan = 2;
        do {
            System.out.print(kelipatan + " ");
            kelipatan=kelipatan+2;
        } while(kelipatan <= 100);
        
    System.out.println(" ");
        
    System.out.println("Bilangan Perkalian 2 (0-100)");
    System.out.println("============================");
     
    int perkalian = 2;
        do {
            System.out.print(perkalian + " ");
            perkalian=perkalian*2;
        } while(perkalian <= 100);
    }
}