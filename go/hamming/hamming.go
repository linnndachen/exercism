package hamming

import "errors"

//Distance is a function for counting how many different characters are there between 2 strings.
func Distance(a, b string) (int, error) {
	res := 0
	runeA := []rune(a)
	runeB := []rune(b)
	if len(runeA) != len(runeB) {
		return res, errors.New("incorrect input")
	}
	for i := range runeA {
		if runeA[i] != runeB[i] {
			res ++
		}
	}
	return res, nil
}

