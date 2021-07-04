const { assert } = require("chai")
const range = (start, stop, step) => Array.from({ length: (stop - 1 - start) / step + 1 }, (_, i) => start + (i * step))


assert.strictEqual(findMultiplier(16), 60)
assert.strictEqual(findMultiplier(22), 119)
assert.strictEqual(findMultiplier(23), 119)
assert.strictEqual(findMultiplierExpression(10), 23)
assert.strictEqual(findMultiplierExpression(20), 78)
assert.strictEqual(iterativeSolution(16), 60)


/*
If we list all the natural numbers below 10 that are multiples of 3 or 5,
 we get 3, 5, 6 and 9. The sum of these multiples is 23.

Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.

Note: If the number is a multiple of both 3 and 5, only count it once.
Also, if a number is negative, return 0(for languages that do have them)
*/

function findMultiplier(n) {
  if (n < 0) return 0

  const mod3 = range(3, n, 3)
  const mod5 = range(5, n, 5)

  console.log(mod3)
  console.log(mod5)
  const arr = [...mod3, ...mod5]

  console.log(new Set(arr))

  return [...new Set(arr)].reduce((acc, each) => acc + each)
}

function findMultiplierExpression(n) {
  return (n < 4) ? 0 : [...new Set([...range(3, n, 3), ...range(5, n, 5)])].reduce((acc, each) => acc + each)
}

function iterativeSolution(n) {
  var sum = 0
  for (var i = 0; i < n; i++) {
    if (i % 3 === 0 || i % 5 === 0) {
      sum += i
    }
  }

  return sum
}