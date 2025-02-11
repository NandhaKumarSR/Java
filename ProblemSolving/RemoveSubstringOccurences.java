//1910. Remove All Occurrences of a Substring
//Approach: Brute force using methods of the String class

public class RemoveSubstringOccurences {
    public static void main(String[] args) {
        System.out.println(removeOccurrences("ababxyabcaab","ab"));
    }

    public static String removeOccurrences(String s, String part) {
        while(s.contains(part)){
            s = s.replaceFirst(part,"");
        }
        return s;       
    }
}
