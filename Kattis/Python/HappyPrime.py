import math

def isPrime(num):
    if num == 1:
        return False

    for x in range(2, int(math.sqrt(num))):
        if num % x == 0:
            return False

    return True

def isHappy(num):
    product = num
    temp = num

    while product != 1:
        num = 0

        while product > 0:
            num += int((product % 10) ** 2)
            product = int(product / 10)

        product = num
        if product == temp:
            return False

    return True


n = int(input())

for x in range(n):
    km = input().split()
    k = int(km[0])
    m = int(km[1])
    print(k, m, end = " ")

    if isHappy(m) and isPrime(m):
        print('YES')
    else:
        print('NO')