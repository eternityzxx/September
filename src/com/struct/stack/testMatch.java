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
    		//����һ���ַ���ѹ��ջ
    		stack.push(bytes[0]);
    		/**
    		 * �ӵڶ����ַ���ʼ��������ջ�е��ַ�ƥ��
    		 */
    		for(int i=1;i<bytes.length;i++) {
    			//peek()�����䷵��ֵ��һ��char���͵��ַ����䷵��ֵ��ָ��ָ��ǰ�ĵ�ǰ�ַ�������ֻ�ǹ۲⣬ָ����ͣ���ڵ�ǰλ�ã��������ơ�
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
    		System.out.println("ջ������: "+stack);
    		System.out.println("����ƥ������: "+isMatch);
    	}
    	sc.close();
    }
}
