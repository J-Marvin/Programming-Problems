x = []
y = []

for i in range(3):
    xy = input().split()
    if xy[0] in x:
        x.remove(xy[0])
    else:
        x.append(xy[0])

    if xy[1] in y:
        y.remove(xy[1])
    else:
        y.append(xy[1])

print(x[0] + " " + y[0])