from array_and_hashing.contains_duplicate import solution


def test_case_one():
    assert solution([1, 2, 3, 1]) == True


def test_case_two():
    assert solution([1, 2, 3, 4]) == False


def test_case_three():
    assert solution([1, 1, 1, 3, 3, 4, 3, 2, 4, 2]) == True
