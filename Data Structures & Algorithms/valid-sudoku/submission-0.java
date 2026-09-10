class Solution {
    public boolean isValidSudoku(char[][] board) {

        // looping de linhas
        for (char[] chars : board) {
            if (!createSets(chars)) return false;
        }

        // looping de colunas: colunas é o for externo e percorro linhas. Crio um []char e testo
        for (int col = 0; col < board.length ; col++) {
            char[] column = new char[board.length];
            for (int lin = 0; lin < board.length ; lin++) {
                column[lin] = board[lin][col];
            }
            if(!createSets(column)) return false;
        }

        // looping de quadrantes
        for (int quad = 0; quad < 9; quad++) {
            int linhaBase = (quad / 3) * 3;
            int colBase = (quad % 3) * 3;

            char[] quadrante = new char[9];
            int idx = 0;
            for (int lin = linhaBase; lin < linhaBase + 3; lin++) {
                for (int col = colBase; col < colBase + 3; col++) {
                    quadrante[idx] = board[lin][col];
                    idx++;
                }
            }
            if (!createSets(quadrante)) return false;
        }

        return true;
    }
    private boolean createSets(char[] nums){
        Set<Character> set = new HashSet<>();
        for (char elem: nums){

            if(set.contains(elem)) return false;
            else if (elem >= '1' && elem <= '9') {
                set.add(elem);
            }
        }
        return true;
    }
}
