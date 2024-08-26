class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];
        
        for(int i=0; i<9; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }
        
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char word = board[i][j];
                
                if(word == '.') continue;
                
                int boxIndex = (i/3)*3 + j/3;
                
                if(rows[i].contains(word) || cols[j].contains(word) ||                                         boxes[boxIndex].contains(word)){
                    return false;
                }
                
                rows[i].add(word);
                cols[j].add(word);
                boxes[boxIndex].add(word);
            }
        }
        
        return true;
    }
}