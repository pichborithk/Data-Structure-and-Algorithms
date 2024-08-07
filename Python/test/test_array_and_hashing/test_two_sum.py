from array_and_hashing.two_sum import solution


def test_case_1():
    assert solution([2, 7, 11, 15], 9) == [0, 1]


def test_case_2():
    assert solution([3, 2, 4], 6) == [1, 2]


def test_case_3():
    assert solution([3, 3], 6) == [0, 1]
