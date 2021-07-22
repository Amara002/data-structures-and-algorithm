package stack;

public class StackBracket {
    public boolean isBalanced(String character) {
        Stack<Character> leftChar = new Stack<>();

        for (int i = 0; i < character.length(); i++) {
            if (character.charAt(i) == '{' || character.charAt(i) == '[' || character.charAt(i) == '(') {
                leftChar.push(character.charAt(i));
            } else {
                if (leftChar.isEmpty()) {
                    return false;
                } else if (character.charAt(i) == '}' && leftChar.peek() == '{')
                    leftChar.pop();
                else if (character.charAt(i) == ']' && leftChar.peek() == '[')
                    leftChar.pop();
                else if (character.charAt(i) == ')' && leftChar.peek() == '(')
                    leftChar.pop();
            }
        }
        return leftChar.isEmpty();
    }
}
