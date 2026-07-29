class Solution {
    public int reverse(int x) {

        int sign = 1;
        if (x < 0) {
            sign = -1;
            x = -x;
        }

        long n = x;
        long t = 0;

        while (n > 0) {
            int s = (int)(n % 10);
            t = t * 10 + s;

            if (t > Integer.MAX_VALUE || t < Integer.MIN_VALUE) {
                return 0;
            }

            n /= 10;
        }

        if (sign == -1) {
            t = -t;
        }

        if (t > Integer.MAX_VALUE || t < Integer.MIN_VALUE) {
            return 0;
        }

        return (int)t;
    }
}