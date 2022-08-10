package Leetcoede;

import java.util.*;

public class validparentheses {

	static boolean validParentheses(String s) {

		ArrayDeque<Character> stack = new ArrayDeque<>();
		for (int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);
			if (current == '(' || current == '[' || current == '{') {

				stack.push(current);

			} else {
				if (stack.isEmpty()) {
					return false;
				}

				if ((current == ')' && stack.peek() == '(') || (current == '}' && stack.peek() == '{')
						|| (current == ']' && stack.peek() == '[')) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {

		String s = "(]";
		// System.out.println(); ValidParentheses(s);
		System.out.println(validParentheses(s));

	}

}
