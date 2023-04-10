def find_paint(paint, key):
    lo = 0
    hi = int(len(paint))
    mid = (lo + hi) / 2

    while lo < hi:
        mid = int((lo + hi) / 2)

        if key > paint[mid]:
            lo = mid + 1
        else:
            hi = mid

    return lo


n, m = [int(x) for x in input().split()]

paint = []
need = []

for x in range(n):
    paint.append(int(input()))

for x in range(m):
    need.append(int(input()))

paint.sort()
need.sort()

total = 0
index = 0

for x in range(m):
    index = int(find_paint(paint, need[x]))
    total += paint[index] - need[x]

print(total)