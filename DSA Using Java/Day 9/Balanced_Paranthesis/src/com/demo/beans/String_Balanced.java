package com.demo.beans;

public class String_Balanced {
	MyStackList stack = new MyStackList();
	
	int i=0;
	public String BalancedParenthesis(String str) {
//		for(; i<str.length()+1; i++) {
//			char ch1 = str.charAt(i);
//			while(!stack.isEmpty()) {
//				stack.push(ch1);
//				if(ch1 == str.charAt(i+1)) {
//					stack.pop();
//				}
//			}
//		}
//		
//		if(stack.isEmpty() ) {
//			return "String is Balanced Expression";
//		}else {
//			return "String is Not Balanced";
//		}
		
		// Create a new stack for each method call.
        // Don't use a class-level variable for the stack or index 'i'.
		MyStackList stack = new MyStackList();
		
		if(str.length() == 0) {
            // An empty string is generally considered balanced.
			return "String is Balanced Expression";
		}
		
        // Loop through every character in the string
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			// --- 1. Handle Opening Brackets ---
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} 
            // --- 2. Handle Closing Brackets ---
            else if (ch == ')' || ch == '}' || ch == ']') {
                
                // If stack is empty, we found a closing bracket with no opener.
				if (stack.isEmpty()) {
					return "String is Not Balanced";
				}
				
                // Pop the last opening bracket
                // We assume pop() returns the character.
                char lastOpener = (char) stack.pop(); 
				
                // --- 3. Check for a Mismatch ---
				if (ch == ')' && lastOpener != '(') {
					return "String is Not Balanced";
				}
				if (ch == '}' && lastOpener != '{') {
					return "String is Not Balanced";
				}
				if (ch == ']' && lastOpener != '[') {
					return "String is Not Balanced";
				}
			}
            // We ignore any other characters (like letters or numbers)
		}
		
		// --- 4. Final Check ---
        // After the loop, if the stack is empty, all brackets were matched.
        // If it's not empty, there are unclosed opening brackets.
		if(stack.isEmpty()) {
			return "String is Balanced Expression";
		} else {
			return "String is Not Balanced";
		}
	}
		
		
	}
	
}
