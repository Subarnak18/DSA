class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer>  have = new HashMap<>();
        for(int i = 0; i < ransomNote.length(); i++)
        {
            char ch = ransomNote.charAt(i);
            need.put(ch, need.getOrDefault(ch, 0)+1);

        }
        for(int i = 0; i < magazine.length(); i++)
        {
            char ch = magazine.charAt(i);
            have.put(ch, have.getOrDefault(ch, 0)+1);
        }
        return fun(need, have);
    }

    public boolean fun(HashMap<Character, Integer> need, HashMap<Character, Integer> have)
    {
        for(Map.Entry<Character, Integer> i : need.entrySet())
        {
            char ch = i.getKey();
            int fneed = i.getValue();
            int fhave = have.getOrDefault(ch, 0);
            if(fhave < fneed)
            {
                return false;
            }
        }
        
    

    return true;
        
    }
}