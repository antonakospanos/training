#!/usr/local/bin/python


# Main function
def main():
    my_function("my Argument 0")


# My Function
def my_function(arg0, arg1=None):
    print("Arg0: " + str(arg0), "\nArg1: " + str(arg1))


# Execution Start
if __name__ == '__main__':
    print("Script started")
    print()
    main()
    print()
    print("Script ended")
    exit(0)