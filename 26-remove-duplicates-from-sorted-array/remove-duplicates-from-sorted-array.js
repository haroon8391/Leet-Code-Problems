function removeDuplicates(nums) {
    let z = 1;

    for(let i=1; i<nums.length; i++){
        if(nums[i] === nums[z-1]){
            continue;
        }
        else{
            [nums[z], nums[i]] = [nums[i], nums[z]];
            z++;
        }
    }

    return z;
};