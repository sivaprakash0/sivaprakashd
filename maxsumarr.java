import java.util.Arrays;
import java.util.Scanner;
public class maxsumarr {
public static void main(String[] args) {
	Scanner rd=new Scanner(System.in);
	int sz=rd.nextInt();
	int ar[]=new int[sz];
	for(int i=0;i<sz;i++){
		ar[i]=rd.nextInt();
	}
	Arrays.sort(ar);
	int l=ar.length;
	int sum=0;
	if(ar[l-1]<=9 && ar[l-2]<=9){
		sum=ar[l-1]+ar[l-2];
		System.out.println(sum);
	}
	if(ar[l-1]>9){
		int a=ar[l-1]%10;
		int b=ar[l-1]/10;
		if(a>b){
			sum=a+ar[l-2];
		System.out.println(sum);}
		else{
			sum=b+ar[l-2];
		System.out.println(sum);}
	}	
}
}
