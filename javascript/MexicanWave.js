function wave(str){
  const arr = [];
  for(let i = 0; i < str.length; i++) {
    let start = str.slice(0, i), end = str.slice(i+1, str.length);
    if(str.charCodeAt(i) > 96 && str.charCodeAt(i) < 123) {
      arr.push(start + str[i].toUpperCase() + end);
    }
  }
  return arr;
}

console.log(wave("two words"));