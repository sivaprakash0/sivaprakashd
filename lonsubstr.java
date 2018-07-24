package set1;

import java.util.Arrays;


public class lonsubstr {
public static void main(String[] args) {
	String gn=args[0];
	char c[]=gn.toCharArray();
	Arrays.sort(c);
	int lon=gn.indexOf(c[c.length-1]);
	System.out.println(gn.substring(lon));
}
}
