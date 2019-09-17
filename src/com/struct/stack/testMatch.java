package com.struct.stack;

import java.util.Scanner;
import java.util.Stack;

public class testMatch {
    public static void main(String args[]) {
    	Stack<Character> stack = new Stack<Character>();
    	Scanner sc = new Scanner(System.in);
    	while(sc.hasNext()) {
    		String target = sc.nextLine();
    		char[] bytes = target.toCharArray();//
    		//将第一个字符串压入栈
    		stack.push(bytes[0]);
    		/**
    		 * 从第二个字符开始，依次与栈中的字符匹配
    		 */
    		for(int i=1;i<bytes.length;i++) {
    			//peek()函数其返回值是一个char类型的字符，其返回值是指针指向当前的当前字符，但它只是观测，指针扔停留在当前位置，并不后移。
    			Character c1 = stack.peek();
    			Character c2 = bytes[i];
    			if((c1.toString().equals("(")&&c2.toString().equals(")"))
    				||(c1.toString().equals("[")&&c2.toString().equals("]"))
    				||(c1.toString().equals("{")&&c2.toString().equals("}"))) {
    			stack.pop();
    			}else {
    				stack.push(c2);
    			}
    		}
    		boolean isMatch = stack.isEmpty();
    		//System.out.println("c1: ");
    		System.out.println("栈内内容: "+stack);
    		System.out.println("括号匹配结果是: "+isMatch);
    	}
    	sc.close();
    }
}
