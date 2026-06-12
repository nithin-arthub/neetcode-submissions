class Solution {
    public boolean isAnagram(String s, String t) {
     if(s.length()!=t.length())
     {
        return false;
     }  
     boolean[] visitedS=new boolean [s.length()];
     boolean[] visitedT=new boolean [t.length()];
     for(int i=0;i<s.length();i++)
     {
        if(visitedS[i])
        {
            continue;
        }
        int counts=1;
        char target=s.charAt(i);
        for(int j=i+1;j<s.length();j++)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                visitedS[j]=true;
                counts++;
            }
        }
        int countt=0;
        for(int j=0;j<t.length();j++)
        {
            if(target==t.charAt(j))
            {
                visitedT[j]=true;
                countt++;
            }
        }
        if(countt!=counts)
        {
            return false;
        }
     
     } 
    return true;
    }
}