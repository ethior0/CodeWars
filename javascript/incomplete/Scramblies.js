function scramble(str1, str2) {
  const regex = new RegExp("^[" + str1 + "]*$");
  return regex.test(str2);
}

console.log(scramble('scriptjavx ', 'javascript'));
// incorrect
