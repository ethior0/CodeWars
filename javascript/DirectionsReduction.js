function dirReduc(arr){
  let arrString = arr.join(",");
  for(let i = 0; i < arr.length; i++) {
    arrString = arrString
    .replace(/NORTH,SOUTH/, "").replace(/SOUTH,NORTH/, "")
    .replace(/EAST,WEST/, "").replace(/WEST,EAST/, "")
    .replace(",,", ",");
  }
  const finalArray = arrString.split(",").filter(v => v);
  return finalArray;
}

const arrayDir = ["NORTH", "WEST", "SOUTH", "EAST"] ;
console.log(dirReduc(arrayDir));