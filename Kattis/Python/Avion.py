found = False
for x in range(1, 6):
    str = input()
    if "FBI" in str:
        print(x, end = " ")
        found = True

if not found:
    print('HE GOT AWAY!')
