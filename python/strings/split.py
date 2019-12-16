#!/usr/local/bin/python


file1 = open("/tmp/hosts", 'r')
string1 = ""
for line in file1:
    string1 += line
file1.close()

file2 = open("/etc/hosts", 'r')
string2 = ""
for line in file2:
    string2 += line
file2.close()

list1 = string1.split(",")
list2 = string2.split(",");
print(len(list1))
print(len(list2))

difference = list(set(list1).difference(set(list2)))
print(difference)
