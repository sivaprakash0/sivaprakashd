import java.util.Arrays;
import java.util.Scanner;
public class maxof10no {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int ar[]=new int[10];
	for(int i=0;i<ar.length;i++){
		ar[i]=in.nextInt();
	}
	Arrays.sort(ar);
	System.out.println(ar[9]);
}
}
