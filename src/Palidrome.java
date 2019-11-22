
public class Palidrome {

	public static void main(String[] args) {
		String str = "Was it a cat I saw?"; 
		  
        if (isPalindrome(str)) 
            System.out.print("Yes"); 
        else
            System.out.print("No"); 
	}
	static boolean isPalindrome(String str) 
    { 
		String str1=str.toLowerCase().replaceAll("\\s+","");
        int i = 0, j = str1.length() - 1; 
        while (i < j) { 
        	if (str1.charAt(i) != str1.charAt(j)) 
                return false; 
            i++; 
            j--; 
        } 
        return true; 
    }

}
