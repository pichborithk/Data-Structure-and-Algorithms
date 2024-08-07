def solution(nums: list[int], target: int) -> list[int]:
    hash_map: dict[int, int] = {}

    for i in range(len(nums)):
        num_to_find = target - nums[i]

        if num_to_find not in hash_map:
            hash_map[nums[i]] = i
        else:
            return [hash_map[num_to_find], i]

    return []
