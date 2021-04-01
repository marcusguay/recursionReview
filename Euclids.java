

public class Euclids{
    
    
    public static void main(String [] args){
     
        System.out.println(Euclids(252,105));
    }   
     
    public static int Euclids(int g, int l){
    int one=g;
    int two=l;
     int oldtwo=two;
        if(one-two==0)
      return one;
      
      
      if(one-two > two){
      one=one-two;
    } else { 
      
        
        two=one-two;
        one=oldtwo;
    }
      
      System.out.println(one+"."+two);
      
      
      return(Euclids(one,two)); 
        
        
        
        
        
        
        
        
        
        
        
    }
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    

    
   
