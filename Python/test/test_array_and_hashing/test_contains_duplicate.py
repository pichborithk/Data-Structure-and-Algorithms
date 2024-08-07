from array_and_hashing.contains_duplicate import solution


def test_case_1():
    assert solution([1, 2, 3, 1]) == True


def test_case_2():
    assert solution([1, 2, 3, 4]) == False


def test_case_3():
    assert solution([1, 1, 1, 3, 3, 4, 3, 2, 4, 2]) == True
