class Solution {
public:

    void round(vector<int>&nums, int start, int end){
        reverse(nums.begin()+start, nums.begin()+end);
    }
    void rotate(vector<int>& nums, int k) {
        reverse(nums.begin(), nums.end());
        int n = nums.size();
        k = k%n;
        round(nums, 0, k);
        round(nums, k, n);
    }
};