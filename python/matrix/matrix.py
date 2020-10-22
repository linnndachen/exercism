class Matrix:
    def __init__(self, matrix_string):
        strings = matrix_string.splitlines()
        splitted_strings = [string.split() for string in strings]
        self.lst_of_nums = [[int(num) for num in lists] for lists in splitted_strings]

    def row(self, index):
        res = self.lst_of_nums[index-1]
        return res

    def column(self, index):
        res = [lst[index-1] for lst in self.lst_of_nums]
        return res
