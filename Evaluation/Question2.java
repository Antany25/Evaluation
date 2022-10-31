package Evaluation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<List<Integer>>set=new HashSet<>();
		int nums[]= {-1,-1,2,-1,-1,2};
        Arrays.sort(nums);
		int n=nums.length,sum=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					List<Integer>list=new ArrayList<>();
					sum=nums[i]+nums[j]+nums[k];
					if(sum==0) {
						list.add(nums[i]);
						list.add(nums[j]);
						list.add(nums[k]);
						set.add(list);}
				}
			}
		}
		System.out.print(set);
	}
}
