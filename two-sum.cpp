class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) 
    {
        vector<int> ans;

        for(int i = 0; i < nums.size(); i++)
        {
            int sear = target - nums[i];

            auto check = find(nums.begin(), nums.end(), sear);

            if(check != nums.end())
            {
                int index = check - nums.begin();

                if(i!=index)
                {
                    ans.push_back(i);
                    ans.push_back(index);
                    break;
                }
            }

        }

        return ans;
    }
};