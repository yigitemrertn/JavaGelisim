import java.util.ArrayList;
import java.util.List;
public class kidsWithGreatestCandies {
    public static void main(String[] args) {
        int[] candies = {1,5,2,4,6};
        int extraCandies = 3;
        List<Boolean> list = new ArrayList<>(); 

        for (int i = 0; i < candies.length; i++) {
            int count = 0;
            for (int j = 0; j < candies.length; j++) {
                if (candies[i] + extraCandies >= candies[j]) {
                    count++;
                }
            }
            if (count == candies.length) {
                list.add(true);
            }
            else list.add(false);
        }

        System.out.println(list);
    }
}
