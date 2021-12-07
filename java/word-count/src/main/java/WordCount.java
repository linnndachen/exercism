import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class WordCount {
    final private static Pattern wordPattern = Pattern.compile("[a-z0-9]+(?:'[a-z]+)?");

    public HashMap<String, Integer> phrase(String words) {
        var wordCount = new HashMap<String, Integer>();
        var matche = wordPattern.matcher(words.toLowerCase());
        while (matche.find()) {
            var key = matche.group();
            wordCount.put(key, wordCount.getOrDefault(key, 0) + 1);
        }
        return wordCount;
    }

}
