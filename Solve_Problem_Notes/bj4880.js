const fs = require("fs");
const stdin = fs.readFileSync("/dev/stdin").toString().trim().split("\n");
const input = (() => {
  let line = 0;
  return () => stdin[line++];
})();


while(a !==0 && b!==0 && c!==0){
    let [a, b, c] = input().split(" ").map(num => parseInt(num));
    if(b-a == c-b){
        console.log("AP "+ c+(b-a));
    }
    else{
        console.log("GP "+ c*(b/a));
    }