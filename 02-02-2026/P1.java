import java.io.*;
import java.util.*;
class P1 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Anusha Kukkadapu\\Downloads\\data.txt"));
            StringBuilder sb = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                sb.append(line).append(" ");
            }
            br.close();

            String text = sb.toString().trim();
            text = text.replaceAll("\\s+", " ");
            int charCount = text.replace(" ", "").length();
            String[] words = text.split(" ");
            int wordCount = words.length;
            String[] sentences = text.split("[.!?]");
            int sentenceCount = sentences.length;
            Map<String, Integer> freq = new HashMap<>();
            for (String w : words) {
                w = w.toLowerCase();
                freq.put(w, freq.getOrDefault(w, 0) + 1);
            }
            freq.entrySet().stream()
                    .sorted((a, b) -> b.getValue() - a.getValue())
                    .limit(5)
                    .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
            for (String s : sentences) {
                StringBuilder rev = new StringBuilder(s.trim());
                System.out.println(rev.reverse());
            }
            String a = new String("Java");
            String b = new String("Java");

            System.out.println(a == b);       
            System.out.println(a.equals(b));  

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
