def get_ascent_distance(time, ascent):
    distance = 0
    curr_time = 0
    i = 0

    while curr_time < time and i < len(ascent):
        if curr_time + ascent[i][1] <= time:
            distance += ascent[i][0]
            curr_time += ascent[i][1]
        else:
            rate = ascent[i][0] / ascent[i][1]
            distance += rate * (time - curr_time)
            curr_time += time - curr_time
        i += 1

    return distance


def get_descent_distance(time, descent, height):
    distance = height
    curr_time = 0
    i = 0

    while curr_time < time and i < len(descent):
        if curr_time + descent[i][1] <= time:
            distance -= descent[i][0]
            curr_time += descent[i][1]
        else:
            rate = descent[i][0] / descent[i][1]
            distance -= rate * (time - curr_time)
            curr_time += time - curr_time
        i += 1

    return distance


def binary_search(lo, hi, height, ascent, descent):
    while lo < hi:
        mid = (lo + hi) / 2
        ad = get_ascent_distance(mid, ascent) # ascent distance
        dd = get_descent_distance(mid, descent, height) # descent distance

        if abs(ad - dd) <= 0.0000001:
            if(get_ascent_distance(int(mid), ascent) == get_descent_distance(int(mid), descent, height)):
                return int(mid)
            else:
                return mid
        elif dd < ad:
            hi = mid
        else:
            lo = mid

    return lo


ad = input().split()

a = int(ad[0])
d = int(ad[1])

ascent = []
descent = []
total_height = 0
descent_time = 0

for x in range(a):
    ht = input().split()
    h = int(ht[0])
    t = int(ht[1])
    total_height += h
    ascent.append([h, t])

for x in range(d):
    ht = input().split()
    h = int(ht[0])
    t = int(ht[1])
    descent_time += t
    descent.append([h, t])

print('%.6f' % binary_search(0, descent_time, total_height, ascent, descent))
