#!/usr/local/bin/python

from multi_py_modules.lib import Lib


if __name__ == '__main__':
    print("Script started")
    print()
    LIB = Lib(0, 1)
    LIB.__test__()
    print()
    print("Script ended")
    exit(0)
