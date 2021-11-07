public class Hamming {
    private final String leftStrand;
    private final String rightStrand;
    private int distance;

    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.isEmpty() && !rightStrand.isEmpty()) {
            throw new IllegalArgumentException("left strand must not be empty.");
        } else if (rightStrand.isEmpty() && !leftStrand.isEmpty()) {
            throw new IllegalArgumentException("right strand must not be empty.");
        } else if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;

        for (int i = 0; i < leftStrand.length(); i++) {
            distance = distance + ((leftStrand.charAt(i) != rightStrand.charAt(i)) ? 1 : 0);
        }

    }

    public int getHammingDistance() {

        return distance;
    }
}
