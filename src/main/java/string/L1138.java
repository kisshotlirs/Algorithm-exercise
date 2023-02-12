package string;

/**
 * @author mojo
 * @description: 字母板上的路径
 * @date 2023/2/12 0012 19:31
 */
public class L1138 {
    public static void main(String[] args) {

    }
}

class SolutionL1138 {
    public String alphabetBoardPath(String target) {
        int cx = 0;
        int cy = 0;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < target.length(); i++) {
            char c = target.charAt(i);
            int nx = (c - 'a') / 5;
            int ny = (c - 'a') % 5;

            if (nx<cx){
                for (int j = 0; j < cx - nx; j++) {
                    sb.append('U');
                }
            }
            if (ny<cy){
                for (int j = 0; j < cy - ny; j++) {
                    sb.append('L');
                }
            }
            if (nx>cx){
                for (int j = 0; j < nx - cx; j++) {
                    sb.append('D');
                }
            }
            if (ny>cy){
                for (int j = 0; j < ny - cy; j++) {
                    sb.append('R');
                }
            }
            sb.append('!');
            cx = nx;
            cy = ny;
        }
        return sb.toString();
    }
}