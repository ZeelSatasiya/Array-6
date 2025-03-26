class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int n = prices.length;
        int min = prices[0];
        for(int i = 1; i < n; i++){
            if(prices[i] > min){
                max = Math.max(max, prices[i] - min);
            }
            else if(prices[i] < min){
                min = prices[i];
            }
        }
        return max;
    }
}

// class Solution {
//     public int maxProfit(int[] prices) {
//         int max = 0;
//         int n = prices.length;
//         for(int i = 0; i < n; i++){
//             for(int j = i + 1; j < n; j++){
//                 if(prices[j] - prices[i] > 0){
//                     max = Math.max(max, prices[j] - prices[i]);
//                 }
//             }
//         }
//         return max;
//     }
// }
