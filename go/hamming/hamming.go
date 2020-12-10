package hamming

import "errors"

//Distance is a function for counting how many different characters are there between 2 strings.
func Distance(a, b string) (int, error) {
	runeA := []rune(a)
	runeB := []rune(b)
	res := 0
	if len(runeA) != len(runeB) {
		return res, errors.New("incorrect input")
	}
	for i := range runeA {
		if runeA[i] != runeB[i] {
			res++
		}
	}
	return res, nil
}
