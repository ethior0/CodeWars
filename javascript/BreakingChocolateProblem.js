console.log(breakChocolate(1, 1))

function breakChocolate(n,m) {

  return n < 1 || m < 1 ? 0 : n * m  - 1;
}