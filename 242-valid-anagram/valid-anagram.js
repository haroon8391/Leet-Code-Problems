/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
function isAnagram(s, t) {
    let sLength = s.length;
    let tLength = t.length;

    if(sLength !== tLength){
        return false;
    }

    let obj = {}

    for(let char of s){
        if(char in obj){
            obj[char] += 1;
        }else{
            obj[char] = 1;
        }
    }


    for(let char of t){
        if(obj[char] !== undefined && obj[char] !== 0){
            obj[char] -= 1;
        }
        else{
            return false;
        }
    }

    return true;
};