function rgb(r, g, b) {
  let hex = "", arr = [checkValues(r), checkValues(g), checkValues(b)];

  for(let i = 0; i < 3; i++) {
    const aux = Math.trunc(arr[i] / 16);
    const aux2 = arr[i] % 16; 
    const digit1 = aux > 9 ? checkDigit(aux) : aux;
    const digit2 = aux2 > 9 ? checkDigit(aux2) : aux2;
    hex += String(digit1) + String(digit2);
  }
  return hex;
}

function checkDigit(num) {
  const letters = [ "A", "B", "C", "D", "E", "F" ];
  return letters[num - 10];
}

function checkValues(num) {
  if (num < 0) return 0;
  return num > 255 ? 255 : num; 
}

console.log(rgb(148, 0, 211));