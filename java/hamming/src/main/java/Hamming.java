public class Hamming {
    private final String leftStrand;
    private final String rightStrand;

    public Hamming(String leftStrand, String rightStrand) {
        int leftSize = leftStrand.length();
        int rightSize = rightStrand.length();

        if (leftSize == 0 && rightSize > 0) {
            throw new IllegalArgumentException("left strand must not be empty.");
        } else if (rightSize == 0 && leftSize > 0) {
            throw new IllegalArgumentException("right strand must not be empty.");
        } else if (leftSize != rightSize) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;

    }

    public int getHammingDistance() {
        int distance = 0;

        for (int i = 0; i < leftStrand.length(); i++) {
            distance = distance + ((leftStrand.charAt(i) != rightStrand.charAt(i)) ? 1 : 0);
        }

        return distance;
    }
}
