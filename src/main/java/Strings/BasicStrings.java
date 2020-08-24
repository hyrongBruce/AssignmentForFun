package AssignmentForFun.src.main.java.Strings;

import java.io.CharArrayReader;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
        return string2+string1;
    }

    public char getChar(String string, int index) {
        return string.charAt(index);
    }

    public String iCantSee(String string) {
    	String resStr = "";
    	for(int i=0;i<string.length();i++) {
    		resStr+=" ";
    	}
        return resStr;
    }

    public String loudAndClear(String string) {
    	
        return string.toUpperCase();
    }

    public String reverseCase(String string) {
		char[] chArr = string.toCharArray();
		for (int i = 0; i < chArr.length; i++) {
			int tempASCII = (int) chArr[i];
			
			if (tempASCII <= 122 && tempASCII >= 97) {
				chArr[i] = (char)(tempASCII-32);
				
			}
			if (tempASCII <= 90 && tempASCII >= 65) {
				chArr[i] = (char)(tempASCII+32);
				
			}
			else {
				continue;
			}
		}
		
		return new String(chArr);
    }

    public String oneAtATime(String string1, String string2) {
    	String res = "";
    	int pointerStr2 = 0;
    	for(int i=0;i<string1.length();i++) {
    		res = res + string1.charAt(i);
    		if(pointerStr2<string2.length()-1) {
    			res = res + string2.charAt(pointerStr2);
    			pointerStr2++;
    		}else if(pointerStr2==string2.length()-1) {
    			res = res + string2.charAt(pointerStr2);
    			continue;
    		}
    		
    	}
    	System.out.println("I didn't quite get the OneAtATimeTest3");
        return res;
    }
    
    // Own test
//    public static void main(String[] args) {
//    	BasicStrings bs = new BasicStrings();
//		bs.reverseCase("lEt mE hEaR yOu");
//	}
}
