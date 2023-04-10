import math

hv = input().split()
h = float(hv[0])
v = float(hv[1])

print(math.ceil(h / math.sin(math.radians(v))))
