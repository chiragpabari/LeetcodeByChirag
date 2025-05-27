class Solution {

    public static void helper(int nums[], List<Integer> ds, boolean IsValid[], List<List<Integer>> ans) {

        if (ds.size() == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < ds.size(); i++) {
                list.add(ds.get(i));
            }
            ans.add(list);
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (IsValid[i] == false) {
                ds.add(nums[i]);
                IsValid[i] = true;
                helper(nums, ds, IsValid, ans);
                IsValid[i] = false;
                ds.remove(ds.size() - 1);
            }
        }

    }

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean IsValid[] = new boolean[nums.length];

        helper(nums, ds, IsValid, ans);

        return ans;

    }
}