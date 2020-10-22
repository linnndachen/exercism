def is_pangram(sentence):
    a_z = list("abcdefghijklmnopqrstuvwxyz")
    sentence = sentence.strip("").lower()

    for letter in a_z:
        if sentence.find(letter) == -1:
            return False
    return True