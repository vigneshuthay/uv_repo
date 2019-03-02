def countdown(n):
    print("counting down")
    while n >= 9:
        yield n
        n -= 1
    return

for x in countdown(10):
    print(x)

