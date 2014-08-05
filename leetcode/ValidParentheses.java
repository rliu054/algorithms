import java.util.*;
public class ValidParentheses {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		String str;
		
		while (true) {
			str = reader.nextLine();
			System.out.print(str);
			System.out.println(isValid(str));
		}
	}
	
    public static boolean isValid(String s) {
    	Stack<Character> st = new Stack<Character>();
    	for (int i = 0; i < s.length(); i++) {
    		char ch = s.charAt(i);
    		if ((ch == '{') || (ch == '(') || (ch == '[')) {
    			st.push(ch);
    		} else {
    			if (!st.empty()) {
    				char pop = st.pop();
    				if (comp(pop, ch) == false)
    					return false;
    			} else {
    				return false;
    			}
    		}
    	}
        if (st.empty())
        	return true;
        return false;
    }
    
    public static boolean comp(char a, char b) {
    	if (((a == '{') && (b == '}')) || 
    		((a == '(') && (b == ')')) ||
    		((a == '[') && (b == ']')))
    		return true;
    	return false;
    }

}
