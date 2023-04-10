def count_digits(num):
    count = 1
    num = int(num / 10)

    while num > 0:
        count += 1
        num = int(num / 10)

    return count


n = int(input())

for x in range(n):
    num = int(input())
    print(count_digits(num))
