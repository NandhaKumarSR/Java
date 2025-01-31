//1678. Goal Parser Interpretation
//approach: brute force

public class GoalParser{
    public static String interpret(String command) {
        String output = "";
        for(int i = 0; i< command.length(); i++){
            if(command.charAt(i) == 'G')
            output +="G";
            if(command.charAt(i) == ')' && i> 0)
                if(command.charAt(i-1) == 'l')
                output+="al";
                else
                output+="o";
        }
        return output;        
    }
    public static void main(String[] args) {
        System.out.println(interpret("G()(al)"));
    }
}