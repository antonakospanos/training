#!/usr/local/bin/python3
from builtins import print


def iterate_integers():
    print()

    i = 1
    for i in range(1, 10):
        if i <= 5:
            print(str(i) + " is smaller or equal than 5")
        else:
            print(str(i) + " is larger than 5")


def iterate_strings():
    print()

    my_list = ["Linux", "Mac OS", "Windows"]
    # Print the first list element
    print(my_list[0])
    # Print the last element
    # Negative values starts the list from the end
    print(my_list[-1])
    # Sublist: first and second elements only
    print(my_list[0:2])
    # Add elements to the list
    my_list.append("Android")

    # remove duplicates from the list
    my_list = list(set(my_list))
    print()
    # Print the content of the list
    for element in my_list:
        print(element)


# Execution start
iterate_integers()
iterate_strings()
