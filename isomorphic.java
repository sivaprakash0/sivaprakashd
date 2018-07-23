import java.util.Scanner;
public class isomorphic {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String str1=in.next();
	String str2=in.next();
	int fd=(str1.charAt(0))-(str2.charAt(0));
	int cnt=1;
	for(int i=1;i<str1.length();i++){
		char c=str1.charAt(i);
		char c1=str2.charAt(i);
		if((c-c1)==fd){
			cnt++;
		}
	}
	if(cnt==str1.length()){
		System.out.println("yes");
	}
	else{
		System.out.println("no");
	}
}
}
