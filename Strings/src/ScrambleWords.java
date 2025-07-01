import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ScrambleWords {

    public static void scrambleWordDeclarative(String name) {

        List<Character> charList = new ArrayList<>( // need to wrap in arraylist or  UnsupportedOperationException.
                name.chars() // converts to Instream
                        .mapToObj(c -> (char) c ) // convert each int into a Character Object
                        .toList()
        );

        Collections.shuffle(charList);

        String scrambledName = charList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(scrambledName);
    }

    //add a method to scramble the given words
    // Say "MOHAN" scramble it to random " AHMON"
    public static void scrambleWordImperative(String name) {

        Character[] carr = new Character[name.length()];

        for (char c : name.toCharArray()) {

            while (true) { // check for the null/empty space and then put the char

                int randomNo = (int) (name.length() * Math.random());
                if (carr[randomNo] == null) {
                    carr[randomNo] = c;
                    break;
                }
            }
        }

        String scrambledName = Arrays.stream(carr)
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(scrambledName);

    }

    public static void main(String[] args) {

        String name = "Mohan";
        scrambleWordImperative(name);
        scrambleWordDeclarative(name);
    }

}
