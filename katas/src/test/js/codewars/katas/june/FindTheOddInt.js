const { assert } = require("chai")


function doTest(a, n) {
  console.log("A = ", a);
  console.log("n = ", n);
  assert.strictEqual(findOdd(a), n);
}


doTest([20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5], 5);
doTest([1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5], -1);
doTest([20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5], 5);
doTest([10], 10);
doTest([1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1], 10);
doTest([5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10], 1);



function findOdd(arr) {

  const m = arr.reverse().reduce((map, it) => map.set(it, (map.get(it) || 0) + 1), new Map())

  console.log(m)

  var odd = 0
  m.forEach((value, key) => {
    console.log(`[ ${key}, ${value}  ]`)
    if (value % 2 !== 0) {
      odd = key
    }
  });

  console.log(odd)

  return odd
}



const findOddBestKataSolution = (xs) => xs.reduce((a, b) => a ^ b);

function doTestBest(a, n) {
  assert.strictEqual(findOddBestKataSolution(a), n)
}

doTestBest([1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1], 10);
doTestBest([5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10], 1);