package com.algorithm.sort;

public class Insert
{
	public static void main(String[] args)
	{
		int[] ins = {4,2,8,0,5,1};
		int[] ins2 = sort(ins);
		for(int in: ins2){
			System.out.print(in);
		}
	}
 
	public static int[] sort(int[] ins){
		
		for(int i=1; i<ins.length; i++){
			for(int j=i; j>0; j--){
				if(ins[j]<ins[j-1]){
					int temp = ins[j-1];
					ins[j-1] = ins[j];
					ins[j] = temp;
				}
			}
		}
		return ins;
	}
}
