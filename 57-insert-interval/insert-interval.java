class Solution {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List <int[]> res = new ArrayList<>();
        int start1 = newInterval[0];
        int end1 = newInterval[1];
        boolean insert = false;
        int n = intervals.length;
        for(int i = 0; i < n; i++)
        {
            int start2 = intervals[i][0];
            int end2 = intervals[i][1];
            if(start1 > end2)
            {
                res.add(new int[]{start2, end2});
            }
            else if(start2 > end1)
            {
                if(insert == false)
                {
                    res.add(new int[]{start1, end1});
                    insert = true;
                }
                res.add(new int[]{start2, end2});
            }
            else
            {
                start1 = Math.min(start1, start2);
                end1 = Math.max(end1, end2);
            }
        }
        if(insert == false)
        {
            res.add(new int[]{start1, end1});

        }

        return res.toArray(new int[res.size()][]);
        
    }
}