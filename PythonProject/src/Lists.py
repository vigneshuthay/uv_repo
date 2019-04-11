list = [1,2,3,'four','five']

print(list);

print(list[:]); #prints all

print(list[:3]); #prints 0,1,2

list.append('six');

print(list);

list1 = [3,1,2]

print(max(list1)); #returns only if all elements of the list are of same type

print(min(list1)); #returns only if all elements of the list are of same type

list2 = ['one','one','two',];

print(max(list2));

tuple = (1,2,'three','four');

print(tuple);

list3 = list(tuple); #converts tuple to list

print(list3);

print(list2.count('one')); #counts how many times 'one' occurs in the list

list1.extend(list2); #appends the contents of list2 to list1

print(list1);

list4 = [3,1,2]

list4.sort(); #sorts the list - only if all the elements of the list are of same type

print(list4);

list4.remove(3); #removes '3' from list4

print(list4);

list4.reverse(); #reverses the list

print(list4);

list4.insert(2,3); #inserts value '3' into 2nd index that is 3rd element - list[2] to the list

print(list4);

print(list4[1]);

print(len(list4)); #prints the length of the list

