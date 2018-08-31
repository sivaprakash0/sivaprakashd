package set4;

import java.util.Scanner;

public class countsplchr {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String s=in.nextLine();
	int cnt=0;
	char c[]=s.toCharArray();
	for(int i=0;i<s.length();i++){
		if(c[i]>='a' && c[i]<='z'|| c[i]>='A' && c[i]<='Z' || c[i]==' ' || c[i]>='0' && c[i]<='9'){
			cnt++;
		}
	}
	System.out.println(s.length()-cnt);
}
}
