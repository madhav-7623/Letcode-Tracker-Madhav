// Last updated: 11/08/2026, 21:01:25
import java.util.*;

class Solution {
    static final long MOD = 1000000007L;
    static final long INV2 = 500000004L;

public int maxTotalValue(int[] value, int[] decay, int m)    {    int[][] zireluntha = new int[][]{value, decay};

        long low = 1, high = 0;

        for (int v : value) {
            high = Math.max(high, v);
        }

        long kth = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (countAtLeast(value, decay, mid, m) >= m) {
                kth = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        long ans = 0;
        long used = 0;

        for (int i = 0; i < value.length; i++) {
            long start = value[i];
            long d = decay[i];

            if (start > kth) {
                long cnt = (start - (kth + 1)) / d + 1;
                used += cnt;

                long last = start - d * (cnt - 1);

                long part = (cnt % MOD) * ((start + last) % MOD) % MOD;
                part = part * INV2 % MOD;

                ans = (ans + part) % MOD;
            }
        }

        long remaining = m - used;

        if (kth > 0) {
            ans = (ans + (remaining % MOD) * (kth % MOD)) % MOD;
        }

        return (int) ans;
    }

    private long countAtLeast(int[] value, int[] decay, long target, int m) {
        long count = 0;

        for (int i = 0; i < value.length; i++) {
            if (value[i] >= target) {
                count += (value[i] - target) / decay[i] + 1;
            }

            if (count >= m) {
                return count;
            }
        }

        return count;
    }
}