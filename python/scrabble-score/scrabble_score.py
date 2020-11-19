from collections import Counter

value = {
    'A': 1, 'B': 3, 'C': 3, 'D': 2, 'E': 1, 'F': 4, 
    'G': 2, 'H': 4, 'I': 1, 'J': 8, 'K': 5, 'L': 1,
    'M': 3, 'N': 1, 'O': 1, 'P': 3, 'Q': 10, 'R': 1,
    'S': 1, 'T': 1, 'U': 1, 'V': 4, 'W': 4, 'X': 8,
    'Y': 4, 'Z': 10
}

def score(word):
    word_c = Counter(word.upper())
    add = [value[letter]*word_c[letter] for letter in word_c]
    return sum(add)



def score_n_better(word):
    word = word.upper()
    add = [value[c] for c in word]
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

"""
value = {
    1: ['A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T'],
    2: ['D', 'G' ],
    3: ['B', 'C', 'M', 'P'],
    4: ['F', 'H', 'V', 'W', 'Y'],
    5: ['K'],
    8: ['J', 'X'],
    10: ['Q', 'Z']
}
"""
