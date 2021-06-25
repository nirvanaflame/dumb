const describe = require('describe');
const chai = require("chai");
const assert = chai.assert;
chai.config.truncateThreshold = 0;


assert.strictEqual(overTheRoad(1, 3), 6);
assert.strictEqual(overTheRoad(3, 3), 4);
assert.strictEqual(overTheRoad(2, 3), 5);
assert.strictEqual(overTheRoad(3, 5), 8);
assert.strictEqual(overTheRoad(7, 11), 16);
assert.strictEqual(overTheRoad(23633656673, 310027696726), 596421736780);

console.log(overTheRoad(7, 11))

function overTheRoad(address, n) {
  return (2 * n + 1) - address
}
