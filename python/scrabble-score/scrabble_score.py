from collections import Counter
from enum import IntEnum


class Letters(IntEnum):
    A = E = I = O = U = L = N = R = S = T = 1
    D = G = 2
    B = C = M = P = 3
    F = H = V = W = Y = 4
    K = 5
    J = X = 8
    Q = Z = 10


def score(word):
    word_c = Counter(word.upper())
    add = [Letters[letter]*word_c[letter] for letter in word_c]
    return sum(add)


def score_space(word):
    word_c = word.upper()
    add = [Letters[letter] for letter in word_c]
    return sum(add)
