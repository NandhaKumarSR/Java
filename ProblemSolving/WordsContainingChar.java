import java.util.ArrayList;
import java.util.List;

public class WordsContainingChar {
    public static void main(String[] args) {

        System.out.println(findWordsContaining(args, 0));
        
    }
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> indices = new ArrayList<Integer>();
        for(int i = 0; i < words.length; i++){
            for(int j= 0; j< words[i].length();j++){
                if(words[i].charAt(j) == x){
                    indices.add(i);
                    break;
                }
            }
        }
        return indices;        
    }
}
