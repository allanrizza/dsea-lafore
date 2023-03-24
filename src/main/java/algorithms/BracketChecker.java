package algorithms;

import datastructures.StackX;

public class BracketChecker extends Algorithm {
    private String input;

    public BracketChecker(String input) {
        this.input = input;
    }

    public void check() {
        int stackSize = input.length();
        StackX stack = new StackX(stackSize);

        for(int i = 0; i < input.length(); i++) {
            char charV = input.charAt(i);
            switch (charV) {
                case '(':
                case '[':
                case '{':
                    stack.push(input.charAt(i));
                    break;
                case ')':
                case ']':
                case '}':
                if(!stack.isEmpty()) {
                    char delChar = stack.pop();
                    if(
                        (charV == ')' && delChar != '(') ||
                        (charV == ']' && delChar != '[') ||
                        (charV == '}' && delChar != '{')
                    ) System.out.println("error.");   
                } else {
                    System.out.println("error");
                }
            }
        }
        if(!stack.isEmpty()) {
            System.out.println("error");
        }
    }
}
