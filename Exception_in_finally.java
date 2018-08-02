// What if exception occurs in finally block itself ?

class Main{
  public static void main(String args[]) throws Exception{
  try{
   int data=25/0;
   System.out.println(data);
  }
  catch(Exception e){System.out.println("Exception occured is "+e);}
 
  finally{
    System.out.println("finally block beforeexecution");
try{    
int k = 25/0;
}catch(Exception e){System.out.println("catch in finally and exception is "+e);}
     //throw new Exception("Exception in Finally");
    System.out.println("finally block after execution after catching exception");}
 
  System.out.println("rest of the code outside finally...");
  }
}


// **Output**

/*
Exception occured is java.lang.ArithmeticException: / by zero                                                                                  
finally block beforeexecution                                                                                                                  
catch in finally and exception is java.lang.ArithmeticException: / by zero                                                                     
finally block after execution after catching exception                                                                                         
rest of the code outside finally...         
*/
