highest = 0
winner = 0

for x in range(1, 6):
    scores = input().split()
    curr_score = 0

    for y in scores:
        curr_score += int(y)

    if curr_score > highest:
        winner = x
        highest = curr_score

print(winner, highest)
