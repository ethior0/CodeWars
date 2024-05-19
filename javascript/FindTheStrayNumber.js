function stray(numbers) {
  let arr = numbers.sort((a, b) => a -b);

  if(arr[0] !== arr[1]) {
    return arr[0];
  }
  return arr[numbers.length-1];
}

console.log( stray( [
  0, 0, 0, 7,
  0, 0, 0
] ) );