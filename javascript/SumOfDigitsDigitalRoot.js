console.log(digitalRoot(256));

function digitalRoot(n) {
  const sum = Array.from(String(n)).reduce((ac, v) => {
    ac += Number(v);
    return ac;
  }, 0);
  return sum > 9 ? digitalRoot(sum) : sum;
}