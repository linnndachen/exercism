from collections import Counter
import re

def count_words(sentence):
    sentence = sentence.lower()

    #split the sentences
    words = re.findall("[0-9]+|[a-z]+['][a-z]|[a-z]+", sentence)

    c = Counter(words)
    return dict(c)
