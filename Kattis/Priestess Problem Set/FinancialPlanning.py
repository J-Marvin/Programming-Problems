def can_invest(investment, days, req):
    sum_profit = 0

    for x in range(int(len(investment))):
        profit = float(investment[x][0]) * days
        if profit > float(investment[x][1]):
            sum_profit += profit - float(investment[x][1])

    if sum_profit >= req:
        return True
    else:
        return False


def lower_bound(low, high, req, investments):
    while low < high:
        mid = int((low + high) / 2)
        if can_invest(investments, mid, req):
            high = mid
        else:
            low = mid + 1

    return low


nm = input().split()
n = int(nm[0])
m = int(nm[1])

investment = []

for x in range(n):
    investment.append(input().split())

print(int(lower_bound(1, 100000000000, m, investment)))
