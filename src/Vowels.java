import java.util.HashSet;
import java.util.Set;

/**
 * Created by svishnu on 6/21/16.
 */
public class Vowels {

    public static Set<Character> vowels() {
        Set<Character> vowels = new HashSet<>();
        for (Character character: "AEIOUaeiou".toCharArray()) {
            vowels.add(character);
        }
        return vowels;
    }

}
