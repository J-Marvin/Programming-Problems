t = int(input())
for i in range(t):
    input()
    gm = input().split()
    ng = int(gm[0])
    nm = int(gm[1])

    g = []
    mg = []

    army = input().split()

    for x in army:
        g.append(int(x))

    army = input().split()

    for x in army:
        mg.append(int(x))

    if max(mg) > max(g):
        print("MechaGodzilla")
    else:
        print("Godzilla")
