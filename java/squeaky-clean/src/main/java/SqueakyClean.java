import java.lang.StringBuilder;

class SqueakyClean {
    static String clean(String identifier) {
        // task 1
        identifier = identifier.replaceAll(" ", "_");

        // task 2: replace all control char first
        //         then remove all other non letter characters
        identifier = identifier.replaceAll("\\p{Cntrl}", "CTRL");
        String regex = "[^\\p{L}\\p{N}\\p{P}\\p{Z}]";
        identifier = identifier.replaceAll(regex, "");

        // task 4: omit lower case Greek letter
        identifier = identifier.replaceAll("[α-ω0-9]", "");

        // task 3: Convert kebab-case to camelCase
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
