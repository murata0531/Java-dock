import java.util.*;

class RLE {
	public static void main(String[] args){
        
		Scanner scn = new Scanner(System.in);
		char s[] = scn.next().toCharArray();
		int ansPos = 0;
		int i, ct;
		
		for (i = 1, ct = 1; i < s.length; i++){
			if (s[i] == s[i-1])
				ct++;
			else{
				System.out.format("%c%d", s[i-1], ct);
				ct = 1;
			}
		}
		if (s[i-1] == s[i-2])
			System.out.format("%c%d\n", s[i-1], ct);
		else
			System.out.format("%c%d\n", s[i-1], ct);
	}

}