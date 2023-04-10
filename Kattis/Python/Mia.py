c = int(input())

for i in range(c):
    scores = []
    data = input().split()
    count = 0

    for x in range(1, int(data[0]) + 1):
        scores.append(float(data[x]))

    average = sum(scores) / len(scores)

    for x in range(1, int(data[0]) + 1):
        if float(data[x]) > average:
            count += 1

    percent = count / int(data[0]) * 100
    print("{:.03f}".format(percent), end = "%\n")
