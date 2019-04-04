
tuple = (1,2,3,4,5);

print(tuple);

print(tuple[1:4]);

tup1 = (12, 34.56);
tup2 = ('abc', 'xyz');

tupleUpdated = tup1 + tup2;

print(tupleUpdated);

del tup1;

#print(tup1); #throws error as tup1 is already deleted

print(tupleUpdated);

print(tuple * 3); #prints 3 times

print(len(tupleUpdated));

print(3 in tupleUpdated); #prints whether 3 is present in tupleUpdated

for x in tuple : print('printing '+str(x));

#No Enclosing Delimiters

#Any set of multiple objects, comma-separated, written without identifying symbols, 
#i.e., brackets for lists, parentheses for tuples, etc., default to tuples

tupleByDefault = 'one',1,'two',3,'four',4;

print(tupleByDefault); #takes tupleByDefault variable as tuple in default as there are not brackets are defined

#Built-in Tuple Functions

#1    cmp(tuple1, tuple2)
#Compares elements of both tuples.
#
#2    len(tuple)
#Gives the total length of the tuple.
#
#3    max(tuple)
#Returns item from the tuple with max value.
#
#4    min(tuple)
#Returns item from the tuple with min value.
#
#5    tuple(seq)
#Converts a list into tuple.

