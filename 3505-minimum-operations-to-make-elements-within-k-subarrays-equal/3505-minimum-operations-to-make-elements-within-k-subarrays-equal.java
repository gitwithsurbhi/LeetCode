class Solution {
    private static final long INF = (long) 1e18;
    public long minOperations(int[] nums, int x, int k) {
        long[] cost = getWindowCosts(nums, x);

        int n = nums.length;

        long[][] dp = new long[n + x + 1][k + 1];

        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], INF);
            dp[i][0] = 0;
        }

        for (int i = n - 1; i >= 0; i--) {

            for (int j = 1; j <= k; j++) {

                long skip = dp[i + 1][j];

                long take = INF;

                if (i + x <= n) {
                    take = cost[i] + dp[i + x][j - 1];
                }

                dp[i][j] = Math.min(skip, take);
            }
        }

        return dp[0][k];
    }

    private long[] getWindowCosts(int[] nums, int x) {

        int n = nums.length;

        long[] res = new long[n];

        TreeMap<Integer, Integer> left = new TreeMap<>();
        TreeMap<Integer, Integer> right = new TreeMap<>();

        long leftSum = 0;
        long rightSum = 0;

        int leftSize = 0;
        int rightSize = 0;

        for (int i = 0; i < n; i++) {

            if (leftSize == 0 || nums[i] <= left.lastKey()) {
                add(left, nums[i]);
                leftSum += nums[i];
                leftSize++;
            } else {
                add(right, nums[i]);
                rightSum += nums[i];
                rightSize++;
            }

            if (i >= x) {

                int out = nums[i - x];

                if (left.containsKey(out)) {
                    remove(left, out);
                    leftSum -= out;
                    leftSize--;
                } else {
                    remove(right, out);
                    rightSum -= out;
                    rightSize--;
                }
            }

            while (leftSize < rightSize) {

                int val = right.firstKey();

                remove(right, val);
                rightSum -= val;
                rightSize--;

                add(left, val);
                leftSum += val;
                leftSize++;
            }

            while (leftSize > rightSize + 1) {

                int val = left.lastKey();

                remove(left, val);
                leftSum -= val;
                leftSize--;

                add(right, val);
                rightSum += val;
                rightSize++;
            }

            if (i >= x - 1) {

                long median = left.lastKey();

                long cost =
                        median * leftSize - leftSum
                                + rightSum - median * rightSize;

                res[i - x + 1] = cost;
            }
        }

        return res;
    }

    private void add(TreeMap<Integer, Integer> map, int val) {
        map.put(val, map.getOrDefault(val, 0) + 1);
    }

    private void remove(TreeMap<Integer, Integer> map, int val) {
        int cnt = map.get(val);

        if (cnt == 1) {
            map.remove(val);
        } else {
            map.put(val, cnt - 1);
        }
    }
    
}