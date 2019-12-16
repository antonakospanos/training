#!/usr/local/bin/python

s1 = "test1"
s2 = "test2"

# Length
len(s)  # Returns the length of string s1

# Substrings
s1[0]  # Gets the element on position i in String s1, position start with zero
s1[-1] # Get the i-tes Sign of the string from behind the string, e.g. -1 returns the last element in the string
s1[0:4]  # Gets the first 4 elements (test)
s1[4:]  # Gets the elements after the first 4 elements (1)

# Concatenation
a = 1
b = 2
c = 3
a + b + c  # Concatenates the int variables a, b,c, e.g. if a=1, b=2, c=3 then the result is 123.

# Case
s1.lower()  # Result will be s1 in lower cases
s1.upper()  # Result will be s1 in upper cases

# Prefix
s1.startswith(s2)  # True, if s1 startsWith s2

# Strip
s1.rstrip()  # Removes the end of line sign from the string
