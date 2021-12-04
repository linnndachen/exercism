import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;


class WordCount {

    Map<String, Integer> phrase(String sentence) {
        Map<String, Integer> wordCount = new HashMap<String, Integer>();
        // cleaning
        sentence = sentence.replaceAll("[^A-Za-z0-9' ]+|(?<=^|\\W)'|'(?=\\W|$)", " ")
                .trim()
                .toLowerCase();

        // String[] words = sentence.split("\\s+");

        /*
        for (int i = 0; i < words.length; i++) {
            String key = words[i];
            int freq = wordCount.getOrDefault(key, 0);
            wordCount.put(key, ++freq);
        }

        return wordCount;

         */

        return Arrays.stream(sentence.split("\\s+"))
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()));
    }

    public static void main(String[] args) {
        WordCount test = new WordCount();
        Map<String, Integer> actualWordCount = test.phrase("Joe can't tell between 'large' and large.");
        System.out.println(actualWordCount);
    }



}
