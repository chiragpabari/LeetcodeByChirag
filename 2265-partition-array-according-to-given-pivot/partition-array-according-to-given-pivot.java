class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        int n = nums.length;

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            if (nums[i] < pivot) {
                l1.add(nums[i]);
            } else if (nums[i] > pivot) {
                l2.add(nums[i]); 
            } else {
                l3.add(nums[i]); // store pivot
            }
        }

        int j = 0;

        for (int i = 0; i < l1.size(); i++) {
            nums[j++] = l1.get(i);
        }

        for (int i = 0; i < l3.size(); i++) {
            nums[j++] = l3.get(i);
        }

        for (int i = 0; i < l2.size(); i++) {
            nums[j++] = l2.get(i);
        }

        return nums;

    }
}