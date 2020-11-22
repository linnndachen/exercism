from collections import Counter

values = {
    1: ['A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T'],
    2: ['D', 'G' ],
    3: ['B', 'C', 'M', 'P'],
    4: ['F', 'H', 'V', 'W', 'Y'],
    5: ['K'],
    8: ['J', 'X'],
    10: ['Q', 'Z']
}

def get_value(d):
    table = {}
    for k, v in d.items():
        for i in v:
            table[i] = k
    return table



def score(word):
    word_c = Counter(word.upper())
    value_table = get_value(values)
    add = [value_table[letter]*word_c[letter] for letter in word_c]
    return sum(add)



def score_n_better(word):
    word = word.upper()
    value_table = get_value(values)
    add = [value_table[c] for c in word]
    return sum(add)



def score_n(word):
    word = word.upper()
    res = 0
    for c in word:
        if c in ['A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T']:
            res += 1
        elif c in ['D', 'G' ]:
            res += 2
        elif c in ['B', 'C', 'M', 'P']:
            res += 3
        elif c in ['F', 'H', 'V', 'W', 'Y']:
            res += 4
        elif c in ['J', 'X']:
            res += 8
        elif c in ['Q', 'Z']:
            res += 10
        else:
            res += 5
    return res
