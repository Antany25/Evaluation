package Evaluation;
import java.util.*;
public class Question1 {
	    public static void main(String[] args) {
	        int a[]={1,2,3,4};
	        int b[]=new int[a.length];
	        int p=1;
	        for(int i=0;i< a.length;i++){
	        	p=1;
	            for(int j=0;j< a.length;j++){
	                if(i!=j)
	                    p*=a[j];
	            }
	            b[i]=p;
	        }
	        System.out.println(Arrays.toString(b));
	    }

}
