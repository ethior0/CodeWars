Array.prototype.sameStructureAs = function (other) {
  if(!Array.isArray(other) || this.length !== other.length) return false;

  for(let i in this) {
    if( Array.isArray(this[i]) !== Array.isArray(other[i]) ) {
      return false;
    }
    if(Array.isArray(this[i]) && Array.isArray(other[i]) ) {
      const arr = Array.from(this[i]);
      return arr.sameStructureAs(other[i]);
    }
  }
  return true;
};

console.log([ 1,[1, 1] ].sameStructureAs( [2,[ 2 ]] )); // false
console.log([].sameStructureAs({})); // false
console.log( [1, 2].sameStructureAs( [ [ 3 ], 3 ] ) ); // false
console.log( [1, '[', ']'].sameStructureAs( ['[', ']', 1] ) ); // true