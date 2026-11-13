class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> row = new HashMap<>();
        Map<Integer, Set<Character>> col = new HashMap<>();
        Map<Integer, Set<Character>> square = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            square.put(i, new HashSet<Character>());
        }

        for (int i = 0; i < 9; i++) {
            Set<Character> a = new HashSet<>();
            Set<Character> b = new HashSet<>();
            row.put(i, a);
            col.put(i, b);
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (!a.add(board[i][j])) {
                        return false;
                    }
                }
                if (board[j][i] != '.') {
                    if (!b.add(board[j][i])) {
                        return false;
                    }
                }
                if (board[i][j] != '.') {
                    int num = (i/3)*3 + j/3;
                    System.out.println(num);
                    if (!square.get(num).add(board[i][j])) {
                        return false;
                    }
                }
                

            }
        }

        return true;
        
    }
}
