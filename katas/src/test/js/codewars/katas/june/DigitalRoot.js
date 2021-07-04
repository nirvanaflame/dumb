const { assert } = require("chai")


console.log(assert.strictEqual(digitalRoot(16), 7))
console.log(assert.strictEqual(digitalRoot(456), 6))

console.log(assert.strictEqual(digitalRootMath(16), 7))
console.log(assert.strictEqual(digitalRootMath(456), 6))


/*
Digital root is the recursive sum of all the digits in a number.

Given n, take the sum of the digits of n.
If that value has more than one digit, continue reducing in this way until a single-digit number is produced.
The input will be a non-negative integer.
*/

function digitalRoot(n) {
  return (n < 0 || n < 10) ? n : digitalRoot(
    n.toString().split('')
      .map(it => parseInt(it))
      .reduce((acc, each) => acc + each)
  )
}

// 17 - 1 -> 16 % 9 -> 7 + 1 = 8  <-> 8 = 1+7 -> 17
function digitalRootMath(n) {
  return (n - 1) % 9 + 1
}