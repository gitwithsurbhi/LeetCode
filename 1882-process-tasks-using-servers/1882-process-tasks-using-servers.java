class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {
        int n = servers.length;
        int m = tasks.length;

        int[] ans = new int[m];

        PriorityQueue<int[]> available = new PriorityQueue<>(
            (a, b) -> {
                if (a[0] != b[0]) return a[0] - b[0]; // weight
                return a[1] - b[1];                   // index
            }
        );

        PriorityQueue<long[]> busy = new PriorityQueue<>(
            (a, b) -> {
                if (a[0] != b[0]) return Long.compare(a[0], b[0]); // endTime
                if (a[1] != b[1]) return Long.compare(a[1], b[1]); // weight
                return Long.compare(a[2], b[2]);                   // index
            }
        );

        for (int i = 0; i < n; i++) {
            available.offer(new int[]{servers[i], i});
        }

        long time = 0;

        for (int i = 0; i < m; i++) {
            time = Math.max(time, i);

            while (!busy.isEmpty() && busy.peek()[0] <= time) {
                long[] curr = busy.poll();
                available.offer(new int[]{
                    (int) curr[1],
                    (int) curr[2]
                });
            }

            if (available.isEmpty()) {
                time = busy.peek()[0];

                while (!busy.isEmpty() && busy.peek()[0] <= time) {
                    long[] curr = busy.poll();
                    available.offer(new int[]{
                        (int) curr[1],
                        (int) curr[2]
                    });
                }
            }

            int[] server = available.poll();

            ans[i] = server[1];

            busy.offer(new long[]{
                time + tasks[i],
                server[0],
                server[1]
            });
        }

        return ans;
    }
}