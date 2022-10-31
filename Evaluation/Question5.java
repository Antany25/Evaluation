package Evaluation;

import java.util.*;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new LinkedList<>();
		List<Integer> list1=new LinkedList<>();
		list.add(2);
		list.add(7);
		list.add(4);
		list.add(3);
		list.add(5);
		list.add(6);
		int n=list.size();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(list.get(i)<list.get(j)) {
					list1.add(list.get(j));
					break;}
				else if(j==n-1) {
					list1.add(0);}
			}
			if(i==n-1) {
				list1.add(0);}
		}
		System.out.print(list1);
	}

}
