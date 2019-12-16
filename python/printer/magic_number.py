#!/usr/local/bin/python
import sys
import random

# Print Args
print("Args: " + str(sys.argv[1:]))

# Get favorite number
print("Hello, what is your favorite number?")
number = input()
print("Your favorite number is: " + number)

# Guess a magic number
minNumber = 1
maxNumber = 100
magicNumber = random.randint(minNumber, maxNumber)

message = "\nFind the calculated magic number! The magic number is between [{0}] and [{1}]"
print(message.format(minNumber, maxNumber))

found = False
while not found:
    print("Make a guess, what will the magic number be?")
    guess = int(input())
    if guess == magicNumber:
        print("Correct, the magic number is: " + str(magicNumber) + "!")
        found = True
    else:
        if guess > magicNumber:
            hint = "too HIGH"
        elif guess < magicNumber:
            hint = "too LOW"
        print("Wrong guess, it was " + hint + "!  Do you want to retry [y/N]?")
        retry = input()
        if retry != "y" and retry != "Y" and retry != "Yes" and retry != "yes":
            print("The magic number was: " + str(magicNumber))
            break
exit(0)
