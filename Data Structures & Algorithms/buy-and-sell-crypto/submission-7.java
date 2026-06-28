class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        for(int i=0;i<prices.length;i++)
        {
           int entry=prices[i];
            for(int j=i;j<prices.length;j++)
            {
               int exit=prices[j];
            
                if(exit>entry)
                {
                    int currentprice=exit-entry;
                    ans=Math.max(currentprice,ans);
                }
            }
        }
        return ans ;
    }
}
