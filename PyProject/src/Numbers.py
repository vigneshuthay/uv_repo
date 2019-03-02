
a , b = 10 , 20 ;

print(a);
print(b);

del(a);

#print(a); #Throws error - a is not defined , as it is deleted
print(b);

#del(a,b); #Throws error - a is not defined , as it is deleted

#print(b); #Throws error - b is not defined , as it is deleted

#int , long , float , complex

number1 = 100;
long1 = 1112223333344444444455555555555555555555;
float1 = 30.33333333;
complex1 = 4.53e-7j

print(number1); print(long1); print(float1); print(complex1);

#Type int(x) to convert x to a plain integer.

#Type long(x) to convert x to a long integer.

#Type float(x) to convert x to a floating-point number.

#Type complex(x) to convert x to a complex number with real part x and imaginary part zero.

#Type complex(x, y) to convert x and y to a complex number with real part x and 
#imaginary part y. x and y are numeric expressions

print(float(long1)); # prints 1.1122233333444445e+39

print(float(number1)); # prints 100.0

print(complex(float1,number1));

print(int(number1));

print(int(long1));


#Mathematical Functions
#1    abs(x)
#The absolute value of x: the (positive) distance between x and zero.
#2    ceil(x)
#The ceiling of x: the smallest integer not less than x
#3    cmp(x, y)
#-1 if x < y, 0 if x == y, or 1 if x > y
#4    exp(x)
#The exponential of x: ex
#5    fabs(x)
#The absolute value of x.
#6    floor(x)
#The floor of x: the largest integer not greater than x
#7    log(x)
#The natural logarithm of x, for x> 0
#8    log10(x)
#The base-10 logarithm of x for x> 0.
#9    max(x1, x2,...)
#The largest of its arguments: the value closest to positive infinity
#10    min(x1, x2,...)
#The smallest of its arguments: the value closest to negative infinity
#11    modf(x)
#The fractional and integer parts of x in a two-item tuple. Both parts have the same sign as x. The integer part is returned as a float.
#12    pow(x, y)
#The value of x**y.
#13    round(x [,n])
#x rounded to n digits from the decimal point. Python rounds away from zero as a tie-breaker: round(0.5) is 1.0 and round(-0.5) is -1.0.
#14    sqrt(x)
#The square root of x for x > 0


#Random Number Functions
#1    choice(seq)
#A random item from a list, tuple, or string.
#2    randrange ([start,] stop [,step])
#A randomly selected element from range(start, stop, step)
#3    random()
#A random float r, such that 0 is less than or equal to r and r is less than 1
#4    seed([x])
#Sets the integer starting value used in generating random numbers. Call this function before calling any other random module function. Returns None.
#5    shuffle(lst)
#Randomizes the items of a list in place. Returns None.
#6    uniform(x, y)
#A random float r, such that x is less than or equal to r and r is less than y


#Trigonometric Functions
#1    acos(x)
#Return the arc cosine of x, in radians.
#2    asin(x)
#Return the arc sine of x, in radians.
#3    atan(x)
#Return the arc tangent of x, in radians.
#4    atan2(y, x)
#Return atan(y / x), in radians.
#5    cos(x)
#Return the cosine of x radians.
#6    hypot(x, y)
#Return the Euclidean norm, sqrt(x*x + y*y).
#7    sin(x)
#Return the sine of x radians.
#8    tan(x)
#Return the tangent of x radians.
#9    degrees(x)
#Converts angle x from radians to degrees.
#10    radians(x)
#Converts angle x from degrees to radians.


#Mathematical Constants
#1   pi    
#The mathematical constant pi.
#2   e     
#The mathematical constant e.


