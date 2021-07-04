const { assert } = require("chai")


assert.strictEqual(likes([]), 'no one likes this');
assert.strictEqual(likes(['Peter']), 'Peter likes this');
assert.strictEqual(likes(['Jacob', 'Alex']), 'Jacob and Alex like this');
assert.strictEqual(likes(['Max', 'John', 'Mark']), 'Max, John and Mark like this');
assert.strictEqual(likes(['Alex', 'Jacob', 'Mark', 'Max']), 'Alex, Jacob and 2 others like this');


function likes(arr) {
  return arr.length === 1 ? `${arr[0]} likes this` :
    arr.length === 2 ? `${arr[0]} and ${arr[1]} like this` :
      arr.length === 3 ? `${arr[0]}, ${arr[1]} and ${arr[2]} like this` :
        arr.length > 3 ? `${arr[0]}, ${arr[1]} and ${arr.length - 2} others like this` :
          'no one likes this'
}
