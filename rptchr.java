package gold;

import java.util.Scanner;

public class rptchr {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int le=in.nextInt();
	String nm[]=new String[le];
	for(int i=0;i<le;i++){
		nm[i]=in.next();
	}
	String a=nm[0];
	char c[]=a.toCharArray();String b="";
    String z="";
    int fn=0;
	for(int j=1;j<le;j++){
		//System.out.println("name is ="+nm[j]);
		b="";
		for(int k=0;k<a.length();k++){
			
      char c1=nm[j].charAt(k);
     
      if(c[k]==c1){
    	  b=b+k;
    	// System.out.println(c[k]+"="+c1+"="+b);
      }
	}
		z=z+b;
		 fn=Integer.parseInt(z.substring(z.length()-1));
		//System.out.println(z+" is total length"+" aND LaSt is "+fn);
	}
	System.out.println(a.substring(0,a.length()));
}
}
