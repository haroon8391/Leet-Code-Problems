class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        for(int i=0; i<accounts.length; i++){
            int temp = 0;
            for(int j=0; j<accounts[0].length; j++){
                temp = temp + accounts[i][j];
                if(temp > sum){
                    sum = temp;
                }
            }
        }
        return sum;
    }
}