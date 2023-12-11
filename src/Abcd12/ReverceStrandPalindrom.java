package Abcd12;

public class ReverceStrandPalindrom {
	public static void main(String[] args) {
		
		String str = "madam";
		String rev = "";
		
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		 System.out.println("Original String :"+str);
		 System.out.println("Reverce String :"+rev);
	    
         if(rev.equals(str)) 
         {
        	 System.out.println("The String is Palindrom");
         }
         else
         {
        	 System.out.println("The String is Not Palindrom");
          }
		 }
      }
