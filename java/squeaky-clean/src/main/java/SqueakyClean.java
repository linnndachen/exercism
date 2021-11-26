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

        // task 4: omit lower case Greek letter and numbers
        identifier = identifier.replaceAll("[α-ω0-9]", "");

        // task 3: Convert kebab-case to camelCase
        StringBuilder string = new StringBuilder(identifier);
        int idx = string.lastIndexOf("-");
        string.replace(idx, idx + 2, string.substring(idx + 1, idx + 2).toUpperCase());
        return string.toString();

    }

    public static void main(String[] args) {
        SqueakyClean test = new SqueakyClean();
        System.out.println(test.clean("my   Id"));
    }
}
