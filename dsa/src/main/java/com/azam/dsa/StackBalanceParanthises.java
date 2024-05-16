package com.azam.dsa;

import java.util.Stack;

public class StackBalanceParanthises {
	static boolean isPair(char open, char close) {
		if (open == '(' && close == ')') {
            return true;
        } else if (open == '{' && close == '}') {
            return true;
        } else if (open == '[' && close == ']') {
            return true;
        } else {
            return false;
        }
	}
	static boolean isBalance(String str) {
		Stack stack = new Stack();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '('|| str.charAt(i) == '{'|| str.charAt(i) == '[') {
				stack.push(str.charAt(i));
			} else {
				if (stack.isEmpty() || !isPair((Character)stack.peek(), str.charAt(i))) {
					return false;
				}
				stack.pop();
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		System.out.println(isBalance("{[()]}")?"YES":"NO");
		System.out.println(isBalance("{[(])}")?"YES":"NO");
		System.out.println(isBalance("{{[[(())]]}}")?"YES":"NO");
	}

}
