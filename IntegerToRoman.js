const roman = {
    M: 1000,
    CM: 900,
    D: 500,
    CD: 400,
    C: 100,
    XC: 90,
    L: 50,
    XL: 40,
    X: 10,
    IX: 9,
    V: 5,
    IV: 4,
    I: 1
}
const IntegerToRoman = (num) => {
    let romanNum = ''
    for (let key in roman) {
        while (num >= roman[key]) {
            romanNum += key
            num -= roman[key]
        }
    }
    return romanNum
}
console.log(IntegerToRoman(34))