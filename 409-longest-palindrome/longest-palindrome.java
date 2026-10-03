class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> f = new HashMap<>();
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            f.put(ch, f.getOrDefault(ch,0)+1);
        }

        boolean odd = false;
        int res = 0;
        for(Map.Entry<Character, Integer>i : f.entrySet())
        {
            int val = i.getValue();
            res += (val / 2) * 2;
            if((val % 2) != 0)
            {
                odd = true;
            }
        }

        if(odd)
        {
            res++;
        }

        return res;
        
    }
}