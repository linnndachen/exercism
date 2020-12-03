package hamming

import "errors"

func Distance(a, b string) (int, error) {
	res := 0
	if len(a) == len(b) {
		for i := range a {
			if a[i] != b[i] {
				res += 1
			}
		}
		return res, nil
	}
	return res, errors.New("Incorrect Input")
}
