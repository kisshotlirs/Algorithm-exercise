package string;

/**
 * @author: zyl
 * @description: 字符串中的单词数
 */
public class L434 {

    public static void main(String[] args) {
        String s = ", , , ,        a, eaefa";
        L434 l = new L434();
        System.out.println(l.countSegments(s));
    }

    public int countSegments(String s) {
        s = s.trim();
        if (s.length()==0){
            return 0;
        }
        //String[] words = s.split(" ");
        String[] words = s.split("\\s+");
        return words.length;
    }
}
