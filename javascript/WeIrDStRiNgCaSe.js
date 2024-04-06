function toWeirdCase(string){
  const arrayString = string.split(" ");
  for(let i = 0; i < arrayString.length; i++) {
    arrayString[i] = conversor(arrayString[i]);
  }
  return arrayString.join(" ");
}

function conversor(string) {
  let newString = "";
  for(let i in string) {
    if (i % 2 === 0) newString += string[i].toUpperCase();
    else newString += string[i];
  }
  return newString;
}
// maybe use map and filter here would be a good option too... but nvm :|

console.log(toWeirdCase("String"));
console.log(toWeirdCase("Weird string case"));