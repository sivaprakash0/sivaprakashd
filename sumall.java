package set1;

import java.util.Scanner;

public class sumall {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int sz=in.nextInt();
	int arr[]=new int[sz];
	for(int i=0;i<sz;i++){
		arr[i]=in.nextInt();
	}
	int tot=0;
	for(int j=0;j<sz;j++){
	tot=arr[j]+tot;	
	}
	System.out.println(tot);
}
}
