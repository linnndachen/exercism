def distance(strand_a, strand_b):
    if len(strand_a) != len(strand_b):
        raise ValueError ("The two strands need to have the same length.")
    res = [True for n in zip(strand_a, strand_b) if n[0] != n[1]]
    return sum(res)


'''
    res = [n for n in zip(strand_a, strand_b) if n[0] != n[1]]
    return len(res)

    #len with filter
    return len([True for n in zip(strand_a, strand_b) if n[0] != n[1]])
    return len(['whateverhere' for n in zip(strand_a, strand_b) if n[0] != n[1]])

    #sum no filter
    return sum(n[0] != n[1] for n in zip(strand_a, strand_b))

    #Destructuring
    return sum(a != b for (a, b) in zip(strand_a, strand_b))
'''
