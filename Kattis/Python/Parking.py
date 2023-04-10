t = int(input())

for x in range(t):
    n = int(input())
    parking = []
    slots = input().split()

    for y in slots:
        parking.append(int(y))

    distance = (max(parking) - min(parking)) * 2
    print(distance)
