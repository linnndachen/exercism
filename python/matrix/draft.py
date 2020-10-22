class Matrix:
    def __init__(self, matrix_string):
        self.matrix_string = matrix_string
        self.strings = self.matrix_string.split("\n")
        self.splitted_strings = [string.split() for string in self.strings]
        self.lst_of_nums = [[int(num) for num in lists] for lists in self.splitted_strings]

    def row(self, index):
        self.index = index
        #row return as a string
        res = self.lst_of_nums[index-1]
        return res

    def column(self, index):
        self.index = index
        res = []
        for lst in self.lst_of_nums:
            res.append(lst[index-1])
        return res

matrix = Matrix("1 2 3\n4 5 6\n7 8 9\n8 7 6")
print(matrix.column(1))