// https://leetcode.com/problems/3sum/

// [-1,0,1,2,-1,-4] => [[-1,-1,2],[-1,0,1]]
// [0,1,1] => []
// [0,0,0] => [[0,0,0]]

/* ---------------------------------- Naive --------------------------------- */

function solution(arr) {
  let result = [];

  for (let i = 0; i < arr.length - 2; i++) {
    for (let j = i + 1; j < arr.length - 1; j++) {
      for (let k = j + 1; k < arr.length; k++) {
        const sum = arr[i] + arr[j] + arr[k];
        if (sum === 0) {
          result.push([arr[i], arr[j], arr[k]]);
        }
      }
    }
  }

  return result;
}
/* ---------------------------------- Naive --------------------------------- */

/* -------------------------------- Optimized ------------------------------- */

function solution2(arr) {
  let result = [];

  arr.sort((a, b) => a - b);

  if (arr[0] > 0) {
    return result;
  }

  for (let i = 0; i < arr.length - 2; i++) {
    if (i > 0 && arr[i] === arr[i - 1]) {
      continue;
    }

    let L = i + 1;
    let R = arr.length - 1;

    while (L < R) {
      const sum = arr[i] + arr[L] + arr[R];
      if (sum < 0) {
        L++;
      } else if (sum > 0) {
        R--;
      } else {
        result.push([arr[i], arr[L], arr[R]]);
        // after push 1 set of result we need to continue to loop to find the possible of another set of result
        const lastLeft = arr[L];
        const lastRight = arr[R];
        // since we don't want duplicate set we will ignore the duplicate value
        while (L < R && lastLeft === arr[L]) {
          L++;
        }

        while (L < R && lastRight === arr[R]) {
          R--;
        }
      }
    }
  }

  return result;
}

// time: O(n2) , space: O(n)

/* -------------------------------- Optimized ------------------------------- */

/* ---------------------------------- Test ---------------------------------- */

console.log(solution2([-1, 0, 1, 2, -1, -4]));
console.log(solution2([0, 1, 1]));
console.log(solution2([0, 0, 0]));
console.log(solution2([0, 0, 0, 0]));
