function getFatorial (num) {
  let tot = 1n;
  while (num > 1) {
    tot *= BigInt(num);
    num--;
  }
  return tot;
}

function zeros (num) {
  const fatorial = getFatorial(num).toString();;
  const regex = /0+$/g;
  const matches = fatorial.match(regex);
  const cc = matches ? matches[0].length : 0;
  return cc;
}

console.log(zeros(100000));
// TA ERRADO POR ENQUANTO