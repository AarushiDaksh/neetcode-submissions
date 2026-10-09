class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){ 
        Set<Character> seen = new HashSet<>();
        for(int j=0;j<9;j++){
            char digit=board[i][j];
            if(digit=='.'){
                continue;
            }
            if(seen.contains(digit)){
                return false;
            }
            seen.add(digit);
        }
        }

        for(int j=0;j<9;j++){
            Set<Character> seen = new HashSet<>();
            for(int i=0;i<9;i++){
                char digit=board[i][j];
                if(digit=='.'){
                    continue;
                }
                if(seen.contains(digit)){
                    return false;
                }
                seen.add(digit);
            }

        }

            for(int boxi=0;boxi<9;boxi+=3){
                for(int boxj=0;boxj<9;boxj+=3){
                    Set<Character> seen = new HashSet<>();
                    for(int i=boxi;i<boxi+3;i++){
                        for(int j=boxj;j<boxj+3;j++){
                            char digit=board[i][j];
                            if(digit=='.'){
                                continue;
                            }
                            if(seen.contains(digit)){
                                return false;
                            }
                            seen.add(digit);
                        }
                    }
                }
            }
        return true;
    }
}
