/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let ans = [];
    let check = false;
    for(let i=0; i<nums.length; i++){
        let rem = target - nums[i];

        for(let j=i; j<nums.length; j++){
            if(rem === nums[j+1]){
                ans[0] = i;
                ans[1] = j+1;
                check = true;
                break;
            }
        }

        if(check)
        break;
    }


    return ans;
};