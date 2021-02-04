
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Assigning String values
		String s1 = "String1";
		String s2 = "String1";
		String s3 = "String2";
		StringBuffer s4 = new StringBuffer("String1");
		StringBuilder s5 = new StringBuilder("   String2   ");
		
        StringBuffer sbr = new StringBuffer("This is String Buffer"); 
        StringBuilder sbdr = new StringBuilder("This is String Builder"); 
          
        // conversion from StringBuffer object to String 
        String str = sbr.toString(); 
        System.out.println("StringBuffer object to String : "); 
        System.out.println(str); 
          
        // conversion from StringBuilder object to String 
        String str1 = sbdr.toString(); 
        System.out.println("StringBuilder object to String : "); 
        System.out.println(str1); 
          
        // changing StringBuffer object sbr 
        // but String object(str) doesn't change 
        sbr.append("Appending to String Buffer"); 
        System.out.println("After appending to String buffer: " + sbr); 
        System.out.println("After appending to String value is same: "  + str); 
        
        // equals vs  ==
        System.out.println("Comparing s1 and s2 (both strings) " + s1.equals(s2)); 
        System.out.println("Comparing s1 and s3 (both strings) " + s1.equals(s3)); 
        System.out.println("Comparing s1 and s3 (string and string buffer same value) " + s1.equals(s4)); 
        
        //concate to string
        System.out.println("Concat string " + s1.concat(" concat to Str"));
        
        //length of the String
        System.out.println("Length of the String1 " + s1.length());
        System.out.println("Length of the String Buffer " + s4.length());
        
        //charAt() returns the character present in the specified location
        System.out.println("Char At index 4 in String1 " + s1.charAt(4));
        System.out.println("Char At index 4 in StringBuffer " + s4.charAt(3));
        
        //trim white spaces - only on Strings
        String s6 = "   -remove   white   spaces-";
        System.out.println("Trim on String:" + s6.trim());
        
        //split
        String[] temp1 = s1.split(s2); 
        String[] temp2 = s1.split(s1); 
        System.out.println("Split String s1 split s2" + temp1);
        System.out.println("Split String s1 split s1 " + temp2);
        
        // to upper and to lower performs only on strings
        System.out.println("s1 to upper: " + s1.toUpperCase());
        System.out.println("s2 to lower: " + s1.toLowerCase());
        
	}

}
