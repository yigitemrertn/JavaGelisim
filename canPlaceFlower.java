

public class canPlaceFlower {
    public static void main(String[] args) {
        int[] flowerbed = {0,0,1,0,1};
        int n = 1;
        int len = flowerbed.length;
        int count = 0;

        for (int i = 0; i < len; i++) {
            if (len == 1) {
                if (flowerbed[0] == 0) {
                    count++;
                }
            }
            else{
                try {
                    if (i == 0 && flowerbed[i+1] == 0) {
                        
                    }
                   if (flowerbed[i-1] == 0 && flowerbed[i] == 0 && flowerbed[i+1] == 0 ) {
                        flowerbed[i] = 1;
                        count++;
                        i = 0;
                    }
                    
                } catch (Exception e) {
                    System.err.println(e);
                }
            }
            System.out.println("i: "+ i + " sayac : "+count);
        }
       System.out.println(count >= n);
    }
}