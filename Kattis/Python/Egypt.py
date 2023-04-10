done = False

while not done:
    abc = input().split()
    sides = []

    for x in abc:
        sides.append(int(x))

    sides.sort()

    a = sides[0]
    b = sides[1]
    c = sides[2]

    if a != 0 and b != 0 and c != 0:
        if a ** 2 + b ** 2 == c ** 2:
            print("right")
        else:
            print("wrong")
    else:
        done = True
