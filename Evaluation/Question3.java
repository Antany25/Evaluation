package Evaluation;

public class Question3 {

	public static void main(String[] args) {
		String s="XYBYAXBY";
		char b[]=s.toCharArray();
		char a,c;
		int n=s.length();
		int count=0;
		if(n<2) {
			System.out.println(count);}
		else {
			for(int i=0;i<n;i++) {
				d:for(int j=i+1;j<n;j++) {
					a=(char) (b[i]+b[j]);
					for(int k=i+1;k<n;k++) {
						for(int l=k+1;l<n;l++) {
							c=(char) (b[k]+b[l]);
							if(a==c) {
								count++;
								break d;}
						}
					}
				}
			}
			System.out.println(count);
		}
	}

}
