import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;


class WordCount {

    Map<String, Integer> phrase(String sentence) {
        Map<String, Integer> wordCount = new HashMap<String, Integer>();
        sentence = sentence.replaceAll("[^A-Za-z0-9' ]+|(?<=^|\\W)'|'(?=\\W|$)", " ")
                .trim()
                .toLowerCase();

        String[] words = sentence.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            String key = words[i];
            int freq = wordCount.getOrDefault(key, 0);
            wordCount.put(key, ++freq);
        }

        return wordCount;
    }

}
