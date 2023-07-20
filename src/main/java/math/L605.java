package math;

/**
 * @author mojo
 * @description: 种花问题
 * @date 2023/7/20 0020 22:42
 */
public class L605 {

    public static void main(String[] args) {
        int[] f = {1,0,0,0,1};
        int n = 1;
        System.out.println(new L605().canPlaceFlowers(f, n));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        for (int i = 0; i < length; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == length-1 || flowerbed[i+1] == 0)){
                n--;
                //把花种上
                flowerbed[i] = 1;
            }
            if (n <= 0){
                return true;
            }
        }
        return false;
    }
}
