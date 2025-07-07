import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * This is a premium leet code question so its not visible. We need to solve it on lint code
 * OR on the Neet code paltform
 * https://neetcode.io/problems/string-encode-and-decode?list=neetcode150
 * YT Sol : https://youtu.be/B1k_sxOSgv8?si=KBpziQmB-UoTjtBn
 *
 * In this question think what kind of special delimiter you can make so you can seperate them while decoding
 * You have to make it in O(N) TC and O(1) SC. So you have to make use of existing vars
 *
 * */
public class M4_EncodeAndDecode {

    public static String encode(List<String> list) {

        StringBuilder sb = new StringBuilder();
        /*
         * Encoding with the help of the word length and a special char '#' to make a unique delimiter
         * */
        for (String s : list) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    /*
     * Take good care of the pointers i and j
     * */
    public static List<String> decode(String str) {

        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {

            StringBuilder sb = new StringBuilder();
            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }
            // Why substring?? what if the number is not a single digit ? say 10 ??
            int wordLength = Integer.parseInt(str.substring(i, j));

            int traversalLength = j + wordLength;
            j = j + 1;
            while (j <= traversalLength) {
                sb.append(str.charAt(j++));
            }

            list.add(sb.toString());
            i = j - 1;
        }
        return list;
    }

    public static void main(String[] args) {

        List<String> list = Arrays.asList("lint", "code", "love", "you");
        List<String> words = Arrays.asList("we", "say", ":", "yes", "!@#$%^&*()");
        System.out.println(decode(encode(words)));
    }
}
