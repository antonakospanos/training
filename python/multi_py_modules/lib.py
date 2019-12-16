#!/usr/local/bin/python
from multi_py_modules.base_lib import BaseLib


class Lib(BaseLib):

    def __init__(self, x, y, *args, **kwargs):
        """
        Method constructing the class
        
        :param args: 
        :param kwargs: keyworded arguments
        """
        super(Lib, self).__init__(x, y, *args, **kwargs)
        '''
        Optionally modify here variables of the BaseLib class
        '''

    # Override test method of BaseLib
    @staticmethod
    def __test__():

        # Init
        lib1 = Lib(2, 3)
        lib2 = Lib(4, 5)

        # Assertion
        print(lib1)
        print(lib2)
        print("Sum: " + str(lib1 + lib2))
        print("Multiplication: " + str(lib1 * lib2))
