
#Arithmetic Operators
#Comparison (Relational) Operators
#Assignment Operators
#Logical Operators
#Bitwise Operators
#Membership Operators
#Identity Operators

#Arithmetic Operators

# ** Exponent - Performs exponential (power) calculation on operators a**b = a to the power b

print(4+2); print(4-2); print(4*2); print(4%2); print(4**2); print(4.5/2); print(4.5//2); print(-4.5//2);

# // - Floor Division - The division of operands where the result is the quotient in which the digits 
#      after the decimal point are removed. But if one of the operands is negative, the result is floored, 
#      i.e., rounded away from zero (towards negative infinity)

#Comparison Operators

# == != > < >= <=

print(3>2); print(3>=2); print(3==2);

#Assignment Operators

#  =    c = a + b assigns value of a + b
#  +=    c += a is equivalent to c = c + a  
#  -=    c -= a is equivalent to c = c - a  
#  *=    c *= a is equivalent to c = c * a  
#  /=    c /= a is equivalent to c = c / a
#  %=    c %= a is equivalent to c = c % a  
#  **=    c **= a is equivalent to c = c ** a
#  //=    c //= a is equivalent to c = c // a

a,b = 1,2;
a += b;

print(a);

#Logical Operators

# and , or , not
a = 3 > 2;
b = 3 < 2;
print(a and b); print(a or b); print(not(a and b));

#Membership Operators

#Python membership operators test for membership in a sequence, such as strings, lists, or tuples.

# in , not in

list = [1,2,3];
list1 = (1);
str = 'Hello';

print('H' in str); print(1 not in list); print(list1 in list);

#Idenitity Operators

# is , is not

print('Hello' is str); print('Hello world' is not str);

#Python Operators Precedence
#
#Highest precedence to the lowest.
#
#1 ** Exponentiation (raise to the power)
#
#2 ~ + - Complement, unary plus and minus (method names for the last two are +@ and -@)
#
#3 * / % // Multiply, divide, modulo and floor division
#
#4 + - Addition and subtraction
#
#5 >> << Right and left bitwise shift
#
#6 & Bitwise 'AND'
#
#7 ^ | Bitwise exclusive `OR' and regular `OR'
#
#8 <= < > >= Comparison operators
#
#9 <> == != Equality operators
#
#10 = %= /= //= -= += *= **= Assignment operators
#
#11 is is not Identity operators
#
#12 in not in Membership operators
#
#13 not or and Logical operators