import java.lang.*;

class SqueakyClean {
    static String clean(String identifier) {
        identifier = identifier.replaceAll(" ", "_");
        identifier = identifier.replaceAll("\\p{Cntrl}", "CTRL");
        identifier = identifier.replaceAll("[α-ω]", "");

        int i = 0;
        while(i < identifier.length()) {
            Character letter = identifier.charAt(i);
            if (letter.matches("-")) {
                char nxt = identifier.charAt(i+1);
                char newNxt = Character.toUpperCase(nxt);
                identifier = identifier.replace(nxt, newNxt);
                identifier = identifier.replace(letter, Character.MIN_VALUE);
            }

            i++;
        }

        return identifier;
    }

    public static void main(String[] args) {
        SqueakyClean test = new SqueakyClean();
        System.out.println(test.clean("à-ḃç"));
    }
}
