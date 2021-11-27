import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Matrix {
    private List<List<Integer>> matrix = new ArrayList<List<Integer>>();
    private final int row;
    private final int col;

    Matrix(String matrixAsString) {
        // turn string into a list of lists
        String lines[] = matrixAsString.split("\n");
        for (String l : lines) {
            List<Integer> arrList = Arrays.stream(l.split(" "))
                                        .mapToInt(Integer::valueOf)
                                        .boxed().collect(Collectors.toList());
            matrix.add(arrList);
        }
        // set row and col
        row = matrix.size();
        col = matrix.get(0).size();
    }

    int[] getRow(int rowNumber) {
        return matrix.get(rowNumber-1).stream().mapToInt(i->i).toArray();
    }

    int[] getColumn(int columnNumber) {
        int res[] = new int[row];

        for (int i=0; i < row; i++) {
            res[i] = matrix.get(i).get(columnNumber-1);
        }
        return res;
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
