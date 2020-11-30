def abbreviate(words):
    """
    1. Replace hyphen by space
    2. Split the string by space
    3. Filter out special charactes in each word
    4. Take the first letter, cap it and the join them tgt
    """
    abbre = []
    words = words.replace('-', ' ').split()
    for word in words:
        word = ''.join(filter(str.isalpha, word))
        abbre.append(word[0].upper())
    return ''.join(abbre)
