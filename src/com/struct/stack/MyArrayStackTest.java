package com.struct.stack;

public class MyArrayStackTest {


	public static void main(String[] args) {
		    MyArrayStack stack = new MyArrayStack(3);
		    stack.push(1);
		    //System.out.println(stack.peek());
		    stack.push(2);
		    stack.push(3);
		    stack.push("abc");
		    System.out.println(stack.peek());
		    stack.pop();
		    stack.pop();
		    stack.pop();
		    System.out.println(stack.peek());
		}
	}

