package other;

/**
 * @author: zyl
 * @description: Excel 表列序号
 */
public class L171 {

    public static void main(String[] args) {
        String n = "BA";
        System.out.println(new L171().titleToNumber(n));
    }

    public int titleToNumber(String columnTitle) {
        int res = 0;
        int n = columnTitle.length();
        for (int i = 0; i < n; i++) {
            res = columnTitle.charAt(i)-'A'+1+
                    res*26;
        }
        return res;
    }
}
