function zeros(num) {
  let cc = 0;
  
  for (let i = 5; Math.floor(num / i) >= 1; i *= 5) {
    cc += Math.floor(num / i);
  }
  return cc;
}

console.log(zeros(100000));
// TA ERRADO POR ENQUANTO