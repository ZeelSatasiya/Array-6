// TC: O(n)
// SC: O(1)
class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;
        int buy1 = Integer.MAX_VALUE;
        int buy2 = Integer.MAX_VALUE;
        int sell1 = 0;
        int sell2 = 0;
        for(int i = 0; i < n; i++){
            buy1 = Math.min(buy1, prices[i]);
            sell1 = Math.max(sell1, prices[i] - buy1);
            // reinvesting profit
            buy2 = Math.min(buy2, prices[i] - sell1);
            sell2 = Math.max(sell2, prices[i] - buy2);
        }

        return sell2;
    }
}
// TC: O(n^2)
// SC: O(1)
// class Solution {
//     public int maxProfit(int[] prices) {
        
//         int max = 0;
//         int n = prices.length;
//         for(int i = 0; i < n; i++){
//             int profit1 = 0;
//             int buymin1 = prices[0];
//             for(int j = 0; j <= i; j++){
//                 if(prices[j] > buymin1){
//                     profit1 = Math.max(profit1, prices[j] - buymin1);
//                 }
//                 else if(prices[j] < buymin1){
//                     buymin1 = prices[j];
//                 }
//             }

//             int profit2 = 0;
//             int buymin2 = prices[i];
//             for(int k = i; k < n; k++){
//                 if(prices[k] > buymin2){
//                     profit2 = Math.max(profit2, prices[k] - buymin2);
//                 }
//                 else if(prices[k] < buymin2){
//                     buymin2 = prices[k];
//                 }
//             }
//             max = Math.max(max, profit1 + profit2);
//         }

//         return max;
//     }
// }
