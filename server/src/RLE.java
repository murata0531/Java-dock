import java.util.*;

class RLE {
	public static void main(String[] args){

		Scanner scn = new Scanner(System.in);

        String command = scn.next();
		char s[] = scn.next().toCharArray();
		int ansPos = 0;
		int i, ct;
        int minus = 0;
        ArrayList<String> result = new ArrayList<>();
		
		if(command.equals("compress")){
            for (i = 1, ct = 1; i < s.length; i++){
                if (s[i] == s[i-1]){
                    ct++;
                    minus = 0;
                }else{
                    minus--;
                    System.out.format("%d%c", ct, s[i-1]);
                    ct = 0;
                }
            }
            if (s[i-1] == s[i-2])
                System.out.format("%d%c\n", ct, s[i-1]);
            else
                System.out.format("%d%c\n", ct, s[i-1]);
        }
	}

}