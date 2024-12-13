
public class gcdOfStrings {

    public static int findGCD(int a, int b) {
        int min = Math.min(a, b); 
        int gcd = 1;
        for (int i = 1; i <= min; i++) { 
            if (a % i == 0 && b % i == 0) {
                gcd = i; 
            }
        }
        return gcd;
    }

    public static void main(String[] args) {

        String str1 = "ABABABABAB";
        String str2 = "ABAB";
        if (str1.contains(str2)) {
          String gcd = str1.substring(0, findGCD(str1.length(), str2.length()));
          System.out.println(gcd);
        }
        else{
            System.out.println("Null");
        }
    }
}
