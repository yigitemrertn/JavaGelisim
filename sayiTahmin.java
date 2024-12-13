import java.util.Scanner;

public class sayiTahmin {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Aralık Başlangıcı: ");
        int baslangic = x.nextInt();
        System.out.print("Aralık Bitişi: ");
        int bitis = x.nextInt();
        int randomNum = (int)(baslangic+Math.random()*bitis);
        int guess;
        do {
            System.out.println("Tahmin: ");
            guess = x.nextInt();

            if(guess<randomNum) System.out.println("Tahmininiz rastgele sayıdan daha küçük");
            else if(guess>randomNum) System.out.println("Tahmininiz rastgele sayıdan daha büyük");
            else System.out.println("Tebrikler! Kazandınız");
        } while (guess!=randomNum);
        x.close();

    }
}