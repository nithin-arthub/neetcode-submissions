class Solution {
    public int maxProfit(int[] prices) {
        int diff=0;
        for(int i=0;i<prices.length;i++)
        {
            for(int j=i+1;j<prices.length;j++)
            {
                int max=prices[j]-prices[i];
                diff=Math.max(diff,max);
            }
        }
        return diff;
    }
}
