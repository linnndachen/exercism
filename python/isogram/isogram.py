"""
def is_isogram(string):
    list_= [c for c in string.lower() if c.isalpha()]
    length = len(list_)
    return len(set(list_)) == length
"""

from collections import Counter

def is_isogram(string):
    list_= [c for c in string.lower() if c.isalpha()]
    cnt = Counter(list_)
    return cnt.most_common(1)[0][1] == 1
