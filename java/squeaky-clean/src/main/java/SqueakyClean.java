import java.lang.StringBuilder;

class SqueakyClean {
    static String clean(String identifier) {
        identifier = identifier.replaceAll(" ", "_");
        identifier = identifier.replaceAll("\\p{Cntrl}", "CTRL");
        identifier = identifier.replaceAll("[α-ω0-9]", "");

        StringBuilder string = new StringBuilder(identifier);
        int i = 0;
        while(i < identifier.length()-1) {
            String letter = string.substring(i, i+1);
            if (letter.matches("-")) {
                char nxt = identifier.charAt(i+1);
                char newNxt = Character.toUpperCase(nxt);
                string.setCharAt(i+1, newNxt);
                string.deleteCharAt(i);
                // identifier = identifier.replace(letter, Character.MIN_VALUE);
            } else {
                i++;
            }

        }

        return string.toString();
    }

    public static void main(String[] args) {
        SqueakyClean test = new SqueakyClean();
        System.out.println(test.clean("\uD83D\uDE00\uD83D\uDE00\uD83D\uDE00"));
    }
}
