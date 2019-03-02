adj = ["red", "big", "tasty"]
fruits = ["apple", "banana", "cherry"]

for x in adj:
  for y in fruits:
    print(x, y)
    
list = [1,2,3,4]

it = iter(list)

print(next(it)) #prints 1 and only 2,3,4 will be in the iterator

for x in it:
    print(x) #prints 2,3,4

    
# it = iter(list)
    
# while True:
#        print (next(it))

