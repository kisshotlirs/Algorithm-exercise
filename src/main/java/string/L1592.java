package string;

/**
 * @author: zyl
 * @description: 重新排列单词间的空格
 */
public class L1592 {

    public static void main(String[] args) {
        String text = "  this   is  a sentence ";
        System.out.println(new L1592().reorderSpaces(text));
    }

    public String reorderSpaces(String text) {
        int blank = 0;
        String[] words = text.trim().split("\\s+");
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)==' '){
                blank++;
            }
        }

        StringBuffer sb = new StringBuffer();
        if (words.length==1){
            sb.append(words[0]);
            for (int i = 0; i < blank; i++) {
                sb.append(" ");
            }
            return sb.toString();
        }

        int avgSpace = blank/(words.length-1);
        int moreSpace = blank%(words.length-1);
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            if (i < words.length-1){
                for (int j = 0; j < avgSpace; j++) {
                    sb.append(" ");
                }
            }
        }
        if (moreSpace>0){
            for (int i = 0; i < moreSpace; i++) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
