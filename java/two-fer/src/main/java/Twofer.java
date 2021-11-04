public class Twofer {
    public String twofer(String name) {
        // String person = (name == null) ? "you" : name;

        return "One for " + ((name == null) ? "you" : name) + ", one for me.";
    }
}
