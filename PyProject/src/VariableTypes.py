
a = b = c = 1; #numbers - int , float , complex
print(a,b,c);
a,b,c = 1,"b",3E+3J;
print(a,b,c);

abc = 'abc'; #string
print(abc * 2) #Prints the string 2 times
print(abc[2:]+abc[:2])

list = [6,"seven",8,'nine',10] #list - enclosed by brackets (square braces)
tinyList = [11,"twelve"];
print(list * 2) #Prints the list 2 times
print(list[1:3])
print(list[0],list[3])
print(list + tinyList)

tuple = ('one',2,"three",4,5) #tuple - enclosed by parenthesis
print(tuple)
print(tuple[0],tuple[4])

#The main difference between lists and tuples are − Lists are enclosed in brackets ( [ ] ) 
#and their elements and size can be changed, while tuples are enclosed in parentheses ( ( ) ) 
#and cannot be updated. Tuples can be thought of as read-only lists

#Python's dictionaries are kind of hash-table type. 
#They work like associative arrays or hashes found in Perl and consist of key-value pairs. 
#A dictionary key can be almost any Python type, but are usually numbers or strings. Values, 
#on the other hand, can be any arbitrary Python object.

#Dictionaries are enclosed by curly braces ({ }) and values can be assigned and accessed using square braces ([]).

dict = {};
dict['one'] = 1;
dict[2] = 'two';

print(dict['one'])
print(dict)

tinyDict = {"one":1,"two":2,3:"three",4:"four"}

print(tinyDict)
print(tinyDict.keys())
print(tinyDict.values())

