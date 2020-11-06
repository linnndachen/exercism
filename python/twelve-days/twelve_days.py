DAYS = ['first', 'second', 'third', 'fourth', 'fifth', 'sixth',
        'seventh', 'eighth', 'ninth', 'tenth', 'eleventh', 'twelfth']

GIFTS = [
    'a Partridge in a Pear Tree',
    'two Turtle Doves',
    'three French Hens',
    'four Calling Birds',
    'five Gold Rings',
    'six Geese-a-Laying',
    'seven Swans-a-Swimming',
    'eight Maids-a-Milking',
    'nine Ladies Dancing',
    'ten Lords-a-Leaping',
    'eleven Pipers Piping',
    'twelve Drummers Drumming'
]

def one_verse(n: int) -> str:
    day = DAYS[n-1]
    verse = "On the {} day of Christmas my true love gave to me: ".format(day)
    if n>1:
        for i in range(n-1, 0, -1):
            verse = verse+GIFTS[i]+", "
        verse = verse+"and "+GIFTS[0]+"."
        return verse
    #for day 1 only
    verse = verse+GIFTS[0]+"."
    return verse


def recite(start: int, finish: int) -> list:
    song = []
    for i in range(start, finish+1):
        song.append(one_verse(i))
    return song

