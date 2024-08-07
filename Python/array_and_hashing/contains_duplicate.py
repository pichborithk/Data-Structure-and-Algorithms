def solution(nums: list[int]) -> bool:
    hash_map: dict[int, bool] = {}

    for num in nums:
        if num not in hash_map:
            hash_map[num] = True
        else:
            return hash_map[num]

    return False
