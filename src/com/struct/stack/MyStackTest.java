package com.struct.stack;
 
public class MyStackTest {
   /**
    * ���ջ��������ʵ�ֵģ��ڲ�������һ�����飬һ����ʾ���������ֵ�Լ�һ��ָ��ջ��Ԫ�ص�top������
    * ���췽�����ݲ����涨����������һ����ջ��push()��������ջ��ѹ��Ԫ�أ�ָ��ջ���ı���top��һ��
    * ʹ��ָ��ԭ���������������һ��λ�ã��������λ���ϴ洢һ�����ݡ�
    * pop()��������top����ָ���Ԫ�أ�Ȼ��top������һ�����Ƴ��������
    * Ҫ֪�� top ����ָ���ʼ����ջ����Ԫ�ء�
    * @param args
    */
	public static void main(String[] args) {
        MyStack stack = new MyStack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
         
    }
 
}