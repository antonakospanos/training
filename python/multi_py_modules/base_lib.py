#!/usr/local/bin/python


class BaseLib(object):

    # Method constructing the class
    def __init__(self, x=0, y=0, *args, **kwargs):
        """
        Method constructing the class
        
        :param x: int
        :param y: int
        """
        self.x = x
        self.y = y

    # Method str(BaseLib) override. Aka: BaseLib.toString()
    def __str__(self):
        """
        Method str(BaseLib) override. Aka: BaseLib.toString()
        
        :return: BaseLib.toString()
        """
        return "Arg0 X: " + str(self.x) + ", Arg1 Y: " + str(self.y)

    # Method overriding '+' operator on P instances. E.g. (lib1 + lib2)
    def __add__(self, second):
        """
        Calculates the sum of the two BaseLib instances
        
        :param second: BaseLib
        :return: The sum of the two BaseLib instances
        """
        result = BaseLib()
        result.x = self.x + second.x
        result.y = self.y + second.y
        return result

    # Method overriding '*' operator on P instances. E.g. (lib1 * lib2)
    def __mul__(self, second):
        """
        Calculates the multiplication of the two BaseLib instances
        
        :param second: BaseLib
        :return: The multiplication of the two BaseLib instances
        """
        result = BaseLib()
        result.x = self.x * second.x
        result.y = self.y * second.y
        return result

    @staticmethod
    def __test__():

        # Init
        lib1 = BaseLib(1, 2)
        lib2 = BaseLib(3, 4)

        # Assertion
        print(lib1)
        print(lib2)
        print("Sum: " + str(lib1 + lib2))
        print("Multiplication: " + str(lib1 * lib2))
