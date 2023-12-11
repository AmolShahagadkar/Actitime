package Abcd12;

public class evenoddprogaram {
	public static void main(String[] args) {
		
	  int num=12346789;
	  int even=0;
	  int odd=0;;

       while(num>0)
       {
    	 int rem=num%10;
    	 if(rem%2==0)
    	 {
    		 even++;
    		 {
    	 odd++;
    		 }
       num=num/10;
       {
       System.out.println("Number of even digits in given num :" +even);
       System.out.println("Number of odd digits in given num :" +odd);
}
       }
    	 }
       }
	}