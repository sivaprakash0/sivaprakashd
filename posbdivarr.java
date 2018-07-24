import java.util.Scanner;
public class posbdivarr {
public static void main(String[] args) {
	Scanner rd=new Scanner(System.in);
	int sz=rd.nextInt();
	int ar[]=new int[sz];
	for(int i=0;i<sz;i++){
		ar[i]=rd.nextInt();
	}
	if(sz>2){
	  int len=ar.length;
	  int fhl=len/2;
	  int sum=0;
	    for(int j=0;j<fhl;j++){
		sum=sum+ar[j];
	    }
	  int fha=sum/(fhl);
	  int tot=0;
	    for(int k=fhl;k<len;k++){
		tot=tot+ar[k];
	     }
	  int shl=ar.length-fhl;
	  int sha=(tot/shl);
	     if(fha==sha){
	        System.out.println("yes");
	     }
	     else{
		System.out.println("no");
	     }
	}
	else{
		System.out.println("no");
	}
}
}
