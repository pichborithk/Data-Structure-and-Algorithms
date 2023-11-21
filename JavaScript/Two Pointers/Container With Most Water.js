// [7,1,2,3,9] => 7 x 4 = 28
// [] => 0
// [7] => 0
// [6,9,3,4,5,8] => 8 x 4 = 32

/* ---------------------------------- Naive --------------------------------- */

function solution(arr) {
  let maxArea = 0;

  for (let i = 0; i <= arr.length; i++) {
    for (let j = i + 1; j < arr.length; j++) {
      let currentArea = Math.min(arr[i], arr[j]) * (j - i);

      maxArea = Math.max(maxArea, currentArea);
    }
  }

  return maxArea;
}

// time: O(n2) , space: O(1)

/* ---------------------------------- Naive --------------------------------- */

/* ---------------------------- Shifting Pointer ---------------------------- */

function solution2(arr) {
  let maxArea = 0;
  let i = 0;
  let j = arr.length - 1;

  while (i < j) {
    let currentArea = Math.min(arr[i], arr[j]) * (j - i);

    maxArea = Math.max(maxArea, currentArea);

    if (arr[i] <= arr[j]) {
      i++;
    } else {
      j--;
    }
  }

  return maxArea;
}

// time: O(n) , space: O(1)

/* ---------------------------- Shifting Pointer ---------------------------- */

/* ---------------------------------- Test ---------------------------------- */

console.log(solution2([7, 1, 2, 3, 9]));
console.log(solution2([]));
console.log(solution2([7]));
console.log(solution2([6, 9, 3, 4, 5, 8]));
