package com.struct.stack;


import java.util.Arrays;
import java.util.EmptyStackException;
 
public class MyArrayStack {
    //�洢Ԫ�ص�����,����ΪObject�����ܴ洢�������͵�����
    private Object[] elementData;
    //ָ��ջ����ָ��
    private int top;
    //ջ��������
    private int size;
     
     
    //Ĭ�Ϲ���һ������Ϊ10��ջ
    public MyArrayStack(){
        this.elementData = new Object[10];
        this.top = -1;
        this.size = 10;
    }
     
    public MyArrayStack(int initialCapacity){
        if(initialCapacity < 0){
            throw new IllegalArgumentException("ջ��ʼ��������С��0: "+initialCapacity);
        }
        this.elementData = new Object[initialCapacity];
        this.top = -1;
        this.size = initialCapacity;
    }
     
     
    //ѹ��Ԫ��
    public Object push(Object item){
        //�Ƿ���Ҫ����
        isGrow(top+1);
        elementData[++top] = item;
        return item;
    }
     
    //����ջ��Ԫ��
    public Object pop(){
        Object obj = peek();
        remove(top);
        return obj;
    }
     
    //��ȡջ��Ԫ��
    public Object peek(){
        if(top == -1){
            throw new EmptyStackException();
        }
        return elementData[top];
    }
    //�ж�ջ�Ƿ�Ϊ��
    public boolean isEmpty(){
        return (top == -1);
    }
     
    //ɾ��ջ��Ԫ��
    public void remove(int top){
        //ջ��Ԫ����Ϊnull
        elementData[top] = null;
        this.top--;
    }
     
    /**
     * �Ƿ���Ҫ���ݣ������Ҫ��������һ��������true������Ҫ�򷵻�false
     * @param minCapacity
     * @return
     */
    public boolean isGrow(int minCapacity){
        int oldCapacity = size;
        //�����ǰԪ��ѹ��ջ֮������������ǰ�涨�������������Ҫ����
        if(minCapacity >= oldCapacity){
            //��������֮��ջ��������
            int newCapacity = 0;
            //ջ������������(����һλ)���Ƿ񳬹�int��������ʾ�����Χ
            if((oldCapacity<<1) - Integer.MAX_VALUE >0){
                newCapacity = Integer.MAX_VALUE;
            }else{
                newCapacity = (oldCapacity<<1);//����һλ���൱��*2
            }
            this.size = newCapacity;
            int[] newArray = new int[size];
            elementData = Arrays.copyOf(elementData, size);
            return true;
        }else{
            return false;
        }
    }
     
     
 
}