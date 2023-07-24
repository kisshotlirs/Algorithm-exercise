package string;

/**
 * @author mojo
 * @description: 宝石与石头
 * @date 2023/7/24 0024 21:36
 */
public class L771 {

    public static void main(String[] args) {
        System.out.println(new L771().numJewelsInStones("aA", "aAbvsaA"));
    }

    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) {
                if (jewels.charAt(j) == stones.charAt(i)) {
                    count++;
                }
            }
        }
        return count;
    }
}
