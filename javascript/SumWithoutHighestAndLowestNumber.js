function sumArray(array) {
  if(!array) return 0;
  let ac = 0;
  const newArray = array.sort((a, b) => a - b);
  for(let i = 1; i < newArray.length - 1; i++) {
    ac += newArray[i];
  }
  return ac;
}

console.log( sumArray([ -6, 20, -1, 10, -12 ]) );