class Solution 
{
    public String longestPalindrome(String s) 
    {
        int st=0,e=0;
        for(int i=0;i<s.length();i++)
        {
            int l1=expandfromcenter(s,i,i+1);
            int l2=expandfromcenter(s,i,i);
            int len=Math.max(l1,l2);
            if(e-st<len)
            {
                st=i-(len-1)/2;
                e=i+len/2;
            }
        }
        return s.substring(st,e+1);
    }
    public int expandfromcenter(String s,int i,int j)
    {
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j))
        {
            i--;
            j++;
        }
        return j-i-1;
    }
}