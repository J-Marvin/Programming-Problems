n = int(input())

for i in range(n):
    scores = input().split()
    sum = int(scores[0])
    difference = int(scores[1])
    found = False
    num1 = sum
    num2 = 0

    while num1 >= sum / 2 and not found:
        while num2 <= sum / 2:
            if num1 + num2 == sum and abs(num1 - num2) == difference:
                print(num1, num2)
                found = True
            num1 -= 1
            num2 += 1

    if not found:
        print('impossible')
