// [1,3,7,9,2], target = 11 => [3,4]
// [1,3,7,9,2], target = 25 => null
// [], target = 2 => null
// [5], target = 5 => null
// [1,6], target = 7 => [0,1]

/* ---------------------------------- Naive --------------------------------- */

function solution(arr, target) {
  for (let i = 0; i <= arr.length; i++) {
    let numberToFind = target - arr[i];
    for (let j = i + 1; j < arr.length; j++) {
      if (arr[j] === numberToFind) {
        return [i, j];
      }
    }
  }

  return null;
}

// time: O(n2) , space: O(1)

/* ---------------------------------- Naive --------------------------------- */

/* -------------------------------- Optimized ------------------------------- */
function solution2(arr, target) {
  let obj = {};
  for (let i = 0; i < arr.length; i++) {
    const currentValue = obj[arr[i]];
    if (currentValue >= 0) {
      return [currentValue, i];
    } else {
      const numberToFind = target - arr[i];
      obj[numberToFind] = i;
    }
  }
  return null;
}

// time: O(n) , space: O(n)

/* -------------------------------- Optimized ------------------------------- */

/* ---------------------------------- Test ---------------------------------- */

console.log(solution2([1, 3, 7, 9, 2], 11));
console.log(solution2([1, 3, 7, 9, 2], 25));
console.log(solution2([], 2));
console.log(solution2([5], 5));
console.log(solution2([1, 6], 7));
