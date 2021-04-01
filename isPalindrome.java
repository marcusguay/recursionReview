

public class isPalindrome{
    //not sure why it doesnt work, never returns true even though it meets all parameters 
    
    public static void main(String [] args){
     System.out.println(Palindrome("poop"));
      
    }   
     
    public static boolean Palindrome(String s){
     String one=s;
     System.out.println(one);
      System.out.println(one.length());
     
     if(one.length()==0 || one.length()==1){
       return true;
    }
   
        
    
   
  
   if(one.charAt(0) == one.charAt(one.length()-1)){
    
       one=one.substring(1,one.length()-1);
       Palindrome(one);
         System.out.println(one);
       
  
   
    }
    
    
  return false;
   
}
    
}
    
    
    
    
    
    
    
    

    
   
