xyz = input().split()
x = int(xyz[0])
y = int(xyz[1])
z = int(xyz[2])
operator = ' '
if x + y == z:
    operator = '+'
elif x - y == z:
    operator = '-'
elif x / y == z:
    operator = '/'
elif x * y == z:
    operator = '*'

if operator != ' ':
    print(str(x) + operator + str(y) + "=" + str(z))
else:
    if y + z == x:
        operator = '+'
    elif y - z == x:
        operator = '-'
    elif y / z == x:
        operator = '/'
    elif y * z == x:
        operator = '*'

    print(str(x) + "=" + str(y) + operator + str(z))