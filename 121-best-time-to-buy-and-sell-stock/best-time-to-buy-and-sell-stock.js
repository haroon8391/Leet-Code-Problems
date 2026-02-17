function maxProfit(prices) {
    let min = prices[0];
    let max = 0
    ;
    for(let z of prices){
        min = Math.min(min, z);
        max = Math.max(max, z - min)
    }

    return max;
};
