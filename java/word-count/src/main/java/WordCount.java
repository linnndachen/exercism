import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


class WordCount {

    Map<String, Integer> phrase(String sentence) {
        // cleaning
        // sentence = sentence.replaceAll("[^A-Za-z0-9' ]+|(?<=^|\\W)'|'(?=\\W|$)", " ")
                // .trim()
                // .toLowerCase();
                // \w+'\w+ |
        Pattern p = Pattern.compile("\\w* | \\w+'\\w+");
        Matcher m = p.matcher(sentence);
        sentence = m.find() ? m.group() : "";

        String[] words = sentence.trim().toLowerCase().split("\\s+");
        Map<String, Integer> wordCount = new HashMap<String, Integer>();

        for (int i = 0; i < words.length; i++) {
            String key = words[i];
            wordCount.put(key, wordCount.getOrDefault(key, 0) + 1);
        }

        return wordCount;


    }

    public static void main(String[] args) {
        WordCount test = new WordCount();
        Map<String, Integer> actualWordCount = test.phrase("Joe can't tell between 'large' and large.");
        System.out.println(actualWordCount);
    }

    /*

        return Arrays.stream(sentence.split("\\s+"))
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()));

     */



}
