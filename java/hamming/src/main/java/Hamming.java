public class Hamming {
    private int distance = 0;

    public Hamming(String leftStrand, String rightStrand) {
        if ((leftStrand == null || leftStrand.isEmpty())
                && (rightStrand != null && !rightStrand.isEmpty())) {
            throw new IllegalArgumentException("left strand must not be empty.");
        }

        if ((rightStrand == null || rightStrand.isEmpty())
                && (leftStrand != null && !leftStrand.isEmpty())) {
            throw new IllegalArgumentException("right strand must not be empty.");
        }

        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        for (int i = 0; i < leftStrand.length(); i++) {
            distance = distance + ((leftStrand.charAt(i) != rightStrand.charAt(i)) ? 1 : 0);
        }

    }

    public int getHammingDistance() {

        return distance;
    }
}
