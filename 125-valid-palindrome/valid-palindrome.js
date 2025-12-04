/**
 * @param {string} s
 * @return {boolean}
 */
function isPalindrome(s){
    let str1 = s.toLowerCase().replace(/[^a-z0-9]/g, '');
    console.log(str1)

    let str = str1.split('')
    console.log(str)

    let i=0;
    let j = str.length - 1;

    while(i < j){
        if(str[i] !== str[j]){
            return false;
        }

        i++;
        j--;
    }


    return true;
};