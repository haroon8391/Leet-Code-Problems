function twoSum(nums, target){
    let ans = []
    let obj = {}

    for(let i=0; i<nums.length; i++){
        let rem = target - nums[i]

        if(rem in obj){
            ans[0] = obj[rem]
            ans[1] = i;
            return ans;
        }

        obj[nums[i]] = i;
    }

    return ans;
}