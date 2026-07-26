class Solution {
    public boolean isHappy(int n) {

        int slow = n;
        int fast = n;

        while (true) {
            slow = sumOfsquare(slow);
            fast = sumOfsquare(fast);
            fast = sumOfsquare(fast);

            if (fast == 1) return true;
            
            if (slow == fast) return false;
        }
    }

    public int sumOfsquare(int n) {
        int sum = 0;
        
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }
}