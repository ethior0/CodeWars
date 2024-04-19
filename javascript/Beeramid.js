var beeramid = function(bonus, price) {
  if(bonus < 0 || price < 0) return 0;

  let cc = 0, pricePerCan = price;
  while(bonus >= pricePerCan) {
    cc++;
    pricePerCan = Math.pow(cc, 2) * price;
    bonus -= pricePerCan
  }
  return bonus < 0 ? cc-1 : cc;
}

console.log(beeramid(-1, 4));

// 1 * 2 -> 9 - 2 = 7
// 4 * 2 -> 7 - 8 = -1;
// 9
// 16
// 25
