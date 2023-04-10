def solve(e, t):
    power = 1
    power *= e ** t
    power %= 1e8
    print(power)

# solve for answer


e, t = list(map(int, input().rstrip().split(" ")))
solve(e, t)