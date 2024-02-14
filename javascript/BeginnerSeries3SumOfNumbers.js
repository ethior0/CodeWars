console.log(getSum(-1, 2))

function getSum(a, b) {

  const max = Math.max(a, b), min = Math.min(a, b);
  let sum = 0;
  
  for (let i = min; i <= max; i++) {
    sum += i;
  }
  return sum;
}