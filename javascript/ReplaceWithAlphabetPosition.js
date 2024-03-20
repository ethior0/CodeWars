console.log(alphabetPosition("^hxf;_ m"))

function alphabetPosition(text) {
  const newText = text.toUpperCase();
  const lettersArray = [];

  for (let index in newText) {
    const position = newText.charCodeAt(index) - 64;
    if (position > 0 && position < 27) lettersArray.push(position);
  }
  
  return lettersArray.join(" ");
}