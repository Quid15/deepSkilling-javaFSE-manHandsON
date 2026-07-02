import java.util.*;
import java.util.stream.*;
public class Tempt {
   public static void main(String[] args){
        String sentence = "git is life";
        //Stream.of(s.split("")).filter(ch-> !ch.equals("i")).forEach(System.out::print);
        String reversedWords = Arrays.stream(sentence.split(" ")).map(word->)
                                    .collect(Collectors.joining(" "));
        
        System.out.println(reversedWords);
   }
}
