function perimeter(n) {
  let a = 0, b = 1, c = 0, fibTot = 1;
  while(n > 0) {
    c = a + b;
    a = b;
    b = c;
    n--;
    fibTot += b;
  }
  return fibTot * 4;
}

console.log(perimeter(30));