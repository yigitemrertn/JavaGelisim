import java.util.Scanner;
public class daire_cevre {
    public static void main(String[] args) {
        final double PI_SAYISI = 3.141593;
        Scanner x = new Scanner(System.in);
        System.out.print("Lütfen dairenizin yarıçapını girin:");
        double yaricap = x.nextDouble();
        double cevre = 2 * PI_SAYISI * yaricap;
        System.out.printf(yaricap + " yarıçaplı darienin çevresi: " +cevre);
        x.close();
    }
}