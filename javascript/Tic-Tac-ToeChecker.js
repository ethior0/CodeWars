function isSolved(board) {
  return checkLineColumn(board) ? checkLineColumn(board) : 0;
}

function checkLineColumn(board) {
  for (let i = 0; i < 3; i++) {
    const line = board[i];
    if (line[0] && (line[0] === line[1] && line[1] === line[2])) return line[0];
    if (board[0][1] && (board[0][i] === board[1][i] && board[1][i] === board[2][i])) return board[0][i];
  }
  if (board[0][2] && (board[0][2] === board[1][1] && board[1][1] === board[2][0])) return board[0][2];
  if (board[0][0] && (board[0][0] === board[1][1] && board[1][1] === board[2][2])) return board[0][0];
  const unfinished = checkUnfinished(board);
  if (unfinished) return unfinished;
}

function checkUnfinished(board) {
  let newBoard = "";
  const boardString = board.join("");
  for (var i = 0; i < boardString.length; i++) {
    if (boardString[i] !== ",") newBoard += boardString[i];
  }
  if (newBoard.includes("0")) return -1;
}

// ☝️🤓 poggers solution
console.log(
  isSolved(
    [[2, 0, 1],
    [0, 2, 2],
    [1, 0, 2]]
  )
);