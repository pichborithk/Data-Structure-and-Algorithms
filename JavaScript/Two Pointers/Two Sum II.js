// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted

// [2,7,11,15], target 9 => [1,2]
// [2,3,4], target = 6 => [1,3]
// [-1,0], target = -1 => [1,2]

/* ---------------------------------- Naive --------------------------------- */
/* ---------------------------------- Naive --------------------------------- */

/* -------------------------------- Optimized ------------------------------- */

function solution2(arr, target) {
  let i = 0;
  let j = arr.length - 1;

  while (i < j) {
    const value = arr[i] + arr[j];

    if (value < target) {
      i++;
    } else if (value > target) {
      j--;
    } else {
      return [i + 1, j + 1];
    }
  }
}

// time: O(n) , space: O(1)

/* -------------------------------- Optimized ------------------------------- */
