public class Twofer {
    public String twofer(String name) {
        String person;

        if (name == null) {
            person = "you";
        } else {
            person = name;
        }

        return "One for " + person + ", one for me.";
    }
}
