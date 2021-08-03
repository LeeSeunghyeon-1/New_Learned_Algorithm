// 전체 코드

const fs = require("fs");
const stdin = fs.readFileSync("/dev/stdin").toString().trim().split("\n");
const input = (() => {
  let line = 0;
  return () => stdin[line++];
})();

let N = input().split(" ");
let len = parseInt(N[0]);
let maxNum = parseInt(N[1]);
let arr;
(arr = []).length = len;
arr = input().split(" ");
let list = arr.filter((e) => e < maxNum);

console.log(list.join(" "));

// 1. Node.js 에서 배열 선언하고 크기 지정해주는 방법

let arr;
(arr = []).length = 3; // 크기가 3인 숫자 배열 생성

arr = input().split(" ");

// 2. filter 메서드
// arr에서 maxNum(지정한 숫자) 보다 작은 숫자들을 골라 list에 저장함

let list = arr.filter((e) => e < maxNum);
