import java.util.Scanner;
public class sqrfrm {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int no1=in.nextInt();
	int no2=in.nextInt();
	int no3=in.nextInt();
	int no4=in.nextInt();
	int no5=in.nextInt();
	int no6=in.nextInt();
	int no7=in.nextInt();
	int no8=in.nextInt();
	if(no1==no2 && no5==no6 && no4==no7 && no3==no8){
		System.out.println("yes");
	    }
	else{
		System.out.println("no");
	    }
     }
}
