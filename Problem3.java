class Solution {
    public int maxProfit(int k, int[] prices) {
        
        int n = prices.length;
        int[][] bs = new int[2][k + 1];
        Arrays.fill(bs[0], Integer.MAX_VALUE);

        for(int i = 0; i < n; i++){
            for(int j = 1; j < k + 1; j++){
                bs[0][j] = Math.min(bs[0][j], prices[i] - bs[1][j - 1]);
                bs[1][j] = Math.max(bs[1][j], prices[i] - bs[0][j]);
            }
        }

        return bs[1][k];
    }
}
