let value = -1;

function zero(fun) {
  if(fun) {
    const res = fun(0);
    value = -1;
    return res;
  }
  return 0;
}

function one(fun) {
  if(fun) {
    const res = fun(1);
    value = -1;
    return res;
  }
  return 1;
}

function two(fun) {
  if(fun) {
    const res = fun(2);
    value = -1;
    return res;
  }
  return 2;
}

function three(fun) {
  if(fun) {
    const res = fun(3);
    value = -1;
    return res;
  }
  return 3;
}

function four(fun) {
  if(fun) {
    const res = fun(4);
    value = -1;
    return res;
  }
  return 4;
}

function five(fun) {
  if(fun) {
    const res = fun(5);
    value = -1;
    return res;
  }
  return 5;
}

function six(fun) {
  if(fun) {
    const res = fun(6);
    value = -1;
    return res;
  }
  return 6;
}

function seven(fun) {
  if(fun) {
    const res = fun(7);
    value = -1;
    return res;
  }
  return 7;
}

function eight(fun) {
  if(fun) {
    const res = fun(8);
    value = -1;
    return res;
  }
  return 8;
}

function nine(fun) {
  if(fun) {
    const res = fun(9);
    value = -1;
    return res;
  }
  return 9;
}

// Operations
function plus(num) {
  if(value === -1) {
    value = typeof num === "function" ? num() : num;
    return plus;
  }
  return value + num;
}

function minus(num) {
  if(value === -1) {
    value = typeof num === "function" ? num() : num;
    return minus;
  }
  return num - value;
}

function times(num) {
  if(value === -1) {
    value = typeof num === "function" ? num() : num;
    return times;
  }
  return value * num;
}

function dividedBy(num) {
  if(value === -1) {
    value = typeof num === "function" ? num() : num;
    return dividedBy;
  }
  return Math.trunc(num / value);
}

console.log(five(dividedBy(eight)));
console.log(nine(plus(one)));

console.log(seven(times(five()))); // must return 35
console.log(four(plus(nine()))); // must return 13
console.log(eight(minus(three()))); // must return 5
console.log(six(dividedBy(two()))); // must return 3