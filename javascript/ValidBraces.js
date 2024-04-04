function validBraces(braces){
  let prevL = "";
  while(braces.length != prevL.length) {
    prevL = braces;
    braces = braces
      .replace("{}", "")
      .replace("()", "")
      .replace("[]", "");
  }
  return braces.length === 0;
}

console.log( validBraces("}}]]))}])") );