 
package BST;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author rumeysa & rana
 */
public class BSTSearchEngine {

    public static String updateContent(String filePath) {
        
        String content = "";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(filePath)));
            String line;

            StringBuilder contentBuilder = new StringBuilder();
            
            while ((line = reader.readLine()) != null) {
                if (!line.strip().startsWith("<")) {
                    content += line.strip() + " ";
                }
            }

            System.out.println(content);

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        List<String> ignoreList = Arrays.asList(
            "a", "ain't", "am", "an", "and", "are", "aren't", "as", "at", "be", "been", "by", "can", "cannot", 
            "cant", "can't", "co", "co.", "com", "could", "couldn't", "did", "didn't", "do", "does", "doesn't", 
            "don't", "eg", "eg", "else", "et", "etc", "ex", "for", "from", "going", "got", "had", "hadn't", "has", 
            "hasn't", "have", "haven't", "he", "he'd", "he'll", "her", "hers", "he's", "hi", "him", "his", "how", "i", 
            "i'd", "ie", "if", "i'll", "i'm", "in", "inc", "instead", "into", "is", "isn't", "it", "it'd", "it'll", "its", 
            "it's", "i've", "let", "let's", "ltd", "may", "mayn't", "me", "might", "mightn't", "mine", "mr", "mrs", "ms", 
            "must", "mustn't", "my", "nd", "needn't", "no", "non", "none", "nor", "not", "of", "off", "oh", "ok", "okay", 
            "on", "one's", "onto", "or", "ought", "oughtn't", "our", "ours", "out", "over", "per", "que", "qv", "rd", "re", 
            "shall", "shan't", "she", "she'd", "she'll", "she's", "should", "shouldn't", "so", "sub", "such", "sup", "th", 
            "than", "that", "that'll", "thats", "that's", "that've", "the", "their", "theirs", "them", "then", "thence", 
            "there", "there'd", "there'll", "there're", "theres", "there's", "there've", "these", "they", "they'd", "they'll", 
            "they're", "they've", "thing", "things", "this", "those", "thus", "to", "too", "un", "up", "us", "via", "viz", 
            "vs", "was", "wasn't", "we", "we'd", "we'll", "were", "we're", "weren't", "we've", "what'll", "what's", "what've", 
            "where's", "who'd", "who'll", "who's", "will", "with", "won't", "would", "wouldn't", "yet", "you", "you'd", "you'll", 
            "your", "you're", "yours", "you've", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", 
            "16", "17", "18", "19", "20"
        );
        
        for (String word : ignoreList) {
            content = content.replaceAll("\\b" + word + "\\b", "");
        }
        
        System.out.println(content);
        return content;
    }
    }
