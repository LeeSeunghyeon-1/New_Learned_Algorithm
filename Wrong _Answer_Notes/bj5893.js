const fs = require("fs");
const stdin = fs.readFileSync("/dev/stdin").toString().trim().split("\n");
const input = (() => {
  let line = 0;
  return () => stdin[line++];
})();

let bin = "0b" + input(); //2진수를 입력받기 위해 앞에 "0b"를 붙여줌
console.log((BigInt(bin) * 17n).toString(2));
// BigInt를 이용하여 입력받은 2진수에 17을 곱해주고 2진수로 표현

// 틀린 이유 : 입력받은 수가 Int 범위를 초과함 -> BigInt 를 사용해야 함
// 오류 떴을 때 범위 확인해볼 것
