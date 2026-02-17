function maxProfit(prices) {
    let min = prices[0];
    let max = prices[0];
    let total = 0;
    for(let z of prices){
        if(z < min){
            min = z;
            max = z;
            continue;
        }

        if(z > max){
            max = z;
            total = Math.max(total, max - min)
        }
    }

    return total;
};
