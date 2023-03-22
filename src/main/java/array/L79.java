package array;

/**
 * @author: zyl
 * @description: L79
 */
public class L79 {
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        System.out.println(new Solution79().exist(board, word));
    }
}

class Solution79 {
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(dfs(board,words,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }

    boolean dfs(char[][] board,char[] words,int i,int j,int k){
        if(i>=board.length || i<0 || j>=board[0].length ||
                j<0 || board[i][j]!=words[k] ) {
            return false;
        }
        if(k==words.length-1){
            return true;
        }
        board[i][j] = '\0';

        //下上右左 依次查找
        boolean res=dfs(board,words,i+1,j,k+1) || dfs(board,words,i-1,j,k+1) ||
                    dfs(board,words,i,j+1,k+1) || dfs(board,words,i,j-1,k+1);
        //还原找过的元素
        board[i][j]=words[k];
        return res;
    }
}
