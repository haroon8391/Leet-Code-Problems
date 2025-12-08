/**
 * @param {number} x
 * @return {boolean}
 */
 function isPalindrome(x) {
    let str = x.toString();

    let i = 0;
    let j = str.length -1;

    while(i < j){
        if(str[i] === str[j]){
            i++;
            j--;
        }
        else{
            return false;
        }
    }

    return true;
};