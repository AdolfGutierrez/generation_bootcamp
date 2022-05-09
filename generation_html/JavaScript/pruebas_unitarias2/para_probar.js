const palindrome = (string) => {
    if(typeof string==="undefined")return
    return string
            .split('')
            .reverse()
            .join('');
}


const average = array => {
    if (typeof array === 'undefined') return;
    if (array.length === 0) return [];
    let sum = 0;
    array.forEach(num => { sum += num });
    return sum / array.length;
}


//exportando un objeto
module.exports={
    palindrome,
    average
}