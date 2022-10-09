from itertools import count
from sys import flags


HW_SOURCE_FILE = 'hw03.py'

#############
# Questions #
#############

def num_sevens(x):
    """Returns the number of times 7 appears as a digit of x.

    >>> num_sevens(3)
    0
    >>> num_sevens(7)
    1
    >>> num_sevens(7777777)
    7
    >>> num_sevens(2637)
    1
    >>> num_sevens(76370)
    2
    >>> num_sevens(12345)
    0
    """
    "*** YOUR CODE HERE ***"
    if x == 7:
        return 1
    elif x < 10:
        return 0
    else:
        return num_sevens(x % 10) + num_sevens(x // 10)

def pingpong(n, res = 1, index = 1):
    """Return the nth element of the ping-pong sequence.

    >>> pingpong(7)
    7
    >>> pingpong(8)
    6
    >>> pingpong(15)
    1
    >>> pingpong(21)
    -1
    >>> pingpong(22)
    0
    >>> pingpong(30)
    6
    >>> pingpong(68)
    2
    >>> pingpong(69)
    1
    >>> pingpong(70)
    0
    >>> pingpong(71)
    1
    >>> pingpong(72)
    0
    >>> pingpong(100)
    2
    """
    "*** YOUR CODE HERE ***"
    def pingpong_down(n, res, index):
        while index < n:
            if index % 7 == 0 or num_sevens(index) > 0:
                return pingpong(n, res + 1, index + 1)
            else:
                return pingpong_down(n, res - 1, index + 1)
        return res
    if n == 1:
        return res
    else:
        while index < n:
            if index % 7 == 0 or num_sevens(index) > 0:
                return pingpong_down(n, res - 1, index + 1)
            else:
                return pingpong(n, res + 1, index + 1)
        return res



""" 
#ITERATION METHOD
def pingpong(n, res = 1, index = 1):
    while index < n:
        if index % 7 == 0 or num_sevens(index) > 0:
            res, index = pingpong_down(n, res - 1, index + 1)
        else:
            res, index = res + 1, index + 1
    return res

def pingpong_down(n, res, index):
    while index < n:
        if index % 7 == 0 or num_sevens(index) > 0:
            return res + 1, index + 1
        else:
            res, index = res - 1, index + 1
    return res, index """

def count_change(total, largest_unit = None):
    """Return the number of ways to make change for total.

    >>> count_change(7)
    6
    >>> count_change(10)
    14
    >>> count_change(20)
    60
    >>> count_change(100)
    9828
    """
    "*** YOUR CODE HERE ***"
    def near_largest_change(num):
        i = 0
        while num != 1:
            num //= 2
            i += 1
        return 2 ** i
    if total < 0:
        return 0
    elif largest_unit == 1 or total == 0 or total == 1:
        return 1
    elif largest_unit == None:
        largest_unit = near_largest_change(total)
    return count_change(total - largest_unit, largest_unit) + count_change(total, largest_unit / 2)
print(count_change(100))

def missing_digits(n, prev_last = 0):
    """Given a number a that is in sorted, increasing order,
    return the number of missing digits in n. A missing digit is
    a number between the first and last digit of a that is not in n.
    >>> missing_digits(1248) # 3, 5, 6, 7
    4
    >>> missing_digits(1122) # No missing numbers
    0
    >>> missing_digits(123456) # No missing numbers
    0
    >>> missing_digits(3558) # 4, 6, 7
    3
    >>> missing_digits(4) # No missing numbers between 4 and 4
    0
    """
    "*** YOUR CODE HERE ***"
    last, all_but_last = n % 10, n // 10
    if (len(str(n)) == 1 and prev_last - n < 2) or n == 0:
        return 0
    elif prev_last == 0 or prev_last - last < 2:
        return missing_digits(all_but_last, last)
    else:
        return prev_last - last - 1 + missing_digits(all_but_last, last)

###################
# Extra Questions #
###################

def print_move(origin, destination):
    """Print instructions to move a disk."""
    print("Move the top disk from rod", origin, "to rod", destination)

def move_stack(n, start, end, middle = 1):
    """Print the moves required to move n disks on the start pole to the end
    pole without violating the rules of Towers of Hanoi.

    n -- number of disks
    start -- a pole position, either 1, 2, or 3
    end -- a pole position, either 1, 2, or 3

    There are exactly three poles, and start and end must be different. Assume
    that the start pole has at least n disks of increasing size, and the end
    pole is either empty or has a top disk larger than the top n start disks.

    >>> move_stack(1, 1, 3)
    Move the top disk from rod 1 to rod 3
    >>> move_stack(2, 1, 3)
    Move the top disk from rod 1 to rod 2
    Move the top disk from rod 1 to rod 3
    Move the top disk from rod 2 to rod 3
    >>> move_stack(3, 1, 3)
    Move the top disk from rod 1 to rod 3
    Move the top disk from rod 1 to rod 2
    Move the top disk from rod 3 to rod 2
    Move the top disk from rod 1 to rod 3
    Move the top disk from rod 2 to rod 1
    Move the top disk from rod 2 to rod 3
    Move the top disk from rod 1 to rod 3
    """
    assert 1 <= start <= 3 and 1 <= end <= 3 and start != end, "Bad start/end"
    "*** YOUR CODE HERE ***"
    while middle < 3 and (middle == start or middle == end):
        middle += 1
    if n == 1:
        print_move(start, end)
    else:
        move_stack(n - 1, start, middle)
        print_move(start, end)
        move_stack(n - 1, middle, end)

from operator import sub, mul

def make_anonymous_factorial():
    """Return the value of an expression that computes factorial.

    >>> make_anonymous_factorial()(5)
    120
    >>> from construct_check import check
    >>> # ban any assignments or recursion
    >>> check(HW_SOURCE_FILE, 'make_anonymous_factorial', ['Assign', 'AugAssign', 'FunctionDef', 'Recursion'])
    True
    """