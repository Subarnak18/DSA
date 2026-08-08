class Solution {

    public int[][] insert(int[][] intervals, int[] newInterval) {

        // Make a new array with space for newInterval
        int[][] a = new int[intervals.length + 1][2];

        // Copy old intervals
        for (int i = 0; i < intervals.length; i++) {
            a[i] = intervals[i];
        }

        // Add new interval
        a[intervals.length] = newInterval;


        // Same sorting as LeetCode 56
        Arrays.sort(a, (x, y) -> Integer.compare(x[0], y[0]));


        // Same code as LeetCode 56
        List<int[]> res = new ArrayList<>();

        int start1 = a[0][0];
        int end1 = a[0][1];

        for (int i = 1; i < a.length; i++) {

            int start2 = a[i][0];
            int end2 = a[i][1];

            if (end1 >= start2) {

                end1 = Math.max(end1, end2);

                continue;
            }

            res.add(new int[]{start1, end1});

            start1 = start2;
            end1 = end2;
        }

        res.add(new int[]{start1, end1});

        return res.toArray(new int[res.size()][2]);
    }
}