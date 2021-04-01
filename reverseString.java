

public class reverseString{
    
    
    public static void main(String [] args){
     
       System.out.println(substring("Test987654321"));
    }   
     
    public static String substring(String str){
    String s="";
        
        
        
        
        if(str.length() == 0){
        
        return "";
     
        }
   
     
       
        s=s+str.charAt(str.length()-1);
        return s + substring(str.substring(0,str.length()-1));   
        
        
   
  
        
        
        
        
    }
    
}
    
    
    
    
    
    
    
    

    
   
