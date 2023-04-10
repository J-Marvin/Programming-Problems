hm = input().split()

h = int(hm[0])
m = int(hm[1])

if m < 45:
    m = (m - 45) % 60
    h = (h - 1) % 24
else:
    m -= 45

print(h, m)
