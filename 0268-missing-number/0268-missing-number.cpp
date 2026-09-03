class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n = nums.size();

        vector<int> arr(n+1, 0);
        int maxx=0, result=0;

        for(int num : nums){
            if(num > maxx) maxx = num;
            arr[num] = 1;
        } 

        for(int i=0; i<arr.size(); i++){
            if(arr[i] == 0) return i; 
        }
        return maxx+1;
    }
};