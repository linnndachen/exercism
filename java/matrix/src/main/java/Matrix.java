import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Matrix {
    private final List<List<Integer>> matrix = new ArrayList<List<Integer>>();

    Matrix(String matrixAsString) {
        // turn string into a list of lists
        // ["1 2 3", "4 5 6"]
        String lines[] = matrixAsString.split("\n");
        List<Integer> arrList = Arrays.stream(lines) // "1 2 3" Stream<String>
                // ["1", "2", "3"] want: Stream<List<String>> now: Stream<String[]>
                .map(l -> l.split(" "))
                .flatMap(s->s.stream()) // Stream<String>
                .mapToInt(Integer::parseInt)
                .collect(Collectors.toList());

        matrix.add(arrList);
    }

    int[] getRow(int rowNumber) {

        return matrix.get(rowNumber-1).stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    int[] getColumn(int columnNumber) {

        return matrix.stream()
                .map(row->row.get(columnNumber-1))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
