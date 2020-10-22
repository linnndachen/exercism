from multiprocessing import Pool
def convert(number):
    if number > 0:
        res = ""
        is_factor = False
        if number % 3 == 0:
            is_factor = True
            res += "Pling"
        if number % 5 == 0:
            is_factor = True
            res += "Plang"
        if number % 7 == 0:
            is_factor = True
            res += "Plong"
        if is_factor == False:
            res = str(number)
        return res
    else:
        return number
