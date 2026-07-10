class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char top=s.charAt(i);
            if(top=='('||top=='['||top=='{')
            {
                st.push(top);
            }
            else
            {
                if(st.isEmpty())return false;
                char ch=st.pop();
                if(ch=='('&&top!=')')return false;
                if(ch=='['&&top!=']')return false;
                if(ch=='{'&&top!='}')return false;
            }
        }
        return st.isEmpty();
    }
}