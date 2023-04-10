n = int(input())
found = False

for x in range(n):
    k = int(input())
    menu = []
    rest = input()
    for y in range(k):
        menu.append(input())

    if "pancakes" in menu and "pea soup" in menu and not found:
        print(rest)
        found = True

if not found:
    print('Anywhere is fine I guess')
