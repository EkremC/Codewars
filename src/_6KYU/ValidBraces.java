package _6KYU;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// https://www.codewars.com/kata/5277c8a221e209d3f6000b56
public class ValidBraces {

    public boolean isValid(String braces) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');

        Stack<Character> stack = new Stack<>();

        for(char c : braces.toCharArray()){
            if(map.containsKey(c)){
                stack.push(c);
            }else{
                if(!stack.isEmpty() && map.get(stack.peek()) == c){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }

}
