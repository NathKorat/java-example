function multiplier(factor){
    return m => m * factor
}

const Double_num = multiplier(2)
const mul_with_3 = multiplier(3)

console.log(Double_num(5))
console.log(mul_with_3(9))