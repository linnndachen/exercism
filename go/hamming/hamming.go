package hamming

import "errors"

//Distance is a function for counting how many different characters are there between 2 strings.
func Distance(a, b string) (int, error) {
	runeA := []rune(a)
	runeB := []rune(b)
	if len(runeA) != len(runeB) {
		return 0, errors.New("incorrect input")
	}
	res := 0
	for i := range runeA {
		if runeA[i] != runeB[i] {
			res++
		}
	}
	return res, nil
}
