package com.algorithm.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InsertionSort {
public static int[] InsertSort(int[] ins){
		
		for(int i=1; i<ins.length; i++){
			int temp = ins[i];//����ÿ����Ҫ������Ǹ���
			int j;
			for(j=i; j>0&&ins[j-1]>temp; j--){//�����������һ�����Ż�
				ins[j] = ins[j-1];//�ɴ�����Ҫ������������ƶ�����󲻴���temp�����Ϳճ���j
			}
			ins[j] = temp;//����Ҫ��������������λ��
		}
		return ins;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     String st = (String) br.readLine();
         String[] result = st.split("\\s+");
         int[] last = new int[result.length];
         for (int i=0;i<result.length;i++) {
             last[i] = Integer.parseInt(result[i]);
         }
	
     	int[] sort=InsertSort(last);
		for(int i=0;i<last.length;i++)	{
			
			System.out.print(sort[i]);
		}
    	
    	
	}

	
    
}
