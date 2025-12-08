function twoSum(nums, target){

    let obj = {}
    let ans = []

    for(let i=0; i<nums.length; i++){
        let rem = target - nums[i];

        if(rem in obj){
            ans[0] = i;
            ans[1] = obj[rem]
            break
        }

        obj[nums[i]] = i;
    }

    return ans;
}