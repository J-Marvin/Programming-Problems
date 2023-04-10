n = 1
d = 1

while n != 0 and d != 0:
    nd = input().split()
    n = int(nd[0])
    d = int(nd[1])

    if n != 0 and d != 0:
        print(int(n / d), end = " ")
        print(int(n % d), end = " / ")
        print(d)
