

public class Stars{
    
    
    public static void main(String [] args){
    reversetriangle(8);
     
    }   
     
   public static void triangle(int n){
       
       
       
 if(n!=0){
       printStars(n-1);
       triangle(n-1);
    }
       
       
       
       
    }
    
    public static void reversetriangle(int n){
      
   if(n!=0){
   
   
     
       reversetriangle(n-1); 
       printStars (n-1);
       
      
    }
    
       
       
   }
    
    
    
    public static void printStars(int n){
 for (int i = 0; i < n; i++) {
 System.out.print("*");
 }
 System.out.println("");
 }
    
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    

    
   
