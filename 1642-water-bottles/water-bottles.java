class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int bottles = numBottles / numExchange;
        int rem = numBottles % numExchange;
        int total = numBottles + bottles;
        int var = bottles + rem;

        while (var >= numExchange) {
            int q = var / numExchange;
            var = var % numExchange + q;
            total += q;
        }

        return total;

    }
}