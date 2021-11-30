import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Matrix {
    private final List<List<Integer>> matrix = new ArrayList<List<Integer>>();
    private final int row;

    Matrix(String matrixAsString) {
        // turn string into a list of lists
        String lines[] = matrixAsString.split("\n");
        for (String l : lines) {
            List<Integer> arrList = Arrays.stream(l.split(" "))
                                        .map(Integer::parseInt)
                                        .collect(Collectors.toList());
            matrix.add(arrList);
        }
        // set row and col
        row = matrix.size();
    }

    int[] getRow(int rowNumber) {

        return matrix.get(rowNumber-1).stream().mapToInt(Integer::intValue).toArray();
    }

    int[] getColumn(int columnNumber) {

        return matrix.stream().map(row->row.get(columnNumber-1)).mapToInt(Integer::intValue).toArray();
    }

    // for testing
    /*
    public static void main(String[] args){
        String matrixAsString = "1 2 3\n4 5 6\n7 8 9\n8 7 6";
        Matrix test = new Matrix(matrixAsString);
        System.out.println(test.getColumn(3));
        System.out.println(test.getRow(3));
    }

     */
}
