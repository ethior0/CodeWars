function deleteNth(arr,n){
  const newArray = [];
  for(let i = arr.length - 1; i >= 0; i--) {
    let totOcc = 1;
    for(let j = i - 1; j >= 0; j--) { 
      if(arr[i] === arr[j]) totOcc++;
    }
    if(totOcc <= n) newArray.unshift(arr[i]);
  }
  return newArray;
}

//                      0  1  2  3
console.log(deleteNth( [20,37,20,21], 1));
console.log(deleteNth( [1,1,3,3,7,2,2,2,2], 3 ));
console.log(deleteNth( [12,39,19,39,39,19,12], 1 ));