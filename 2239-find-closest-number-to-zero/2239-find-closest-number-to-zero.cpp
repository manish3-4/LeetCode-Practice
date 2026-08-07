class Solution {
public:
    int findClosestNumber(vector<int>& nums) {
        int minAbs = abs(nums[0]);
        int result = nums[0];
        
        for(int num : nums) {
            int absNum = abs(num);
            if(absNum < minAbs) {
                minAbs = absNum;
                result = num;
            } else if(absNum == minAbs && num > result) {
                result = num;
            }
        }
        
        return result;
    }
};