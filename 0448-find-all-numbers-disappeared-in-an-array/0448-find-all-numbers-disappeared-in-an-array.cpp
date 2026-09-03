class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        vector<int> ans(nums.size()+1, 0), result;

        for(int num : nums){
            ans[num] = num;
        }

        for(int i=1; i<ans.size(); i++){
            if(ans[i] == 0) result.push_back(i);
        }
        return result;
    }
};