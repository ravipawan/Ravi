package javapractise;

public class Test1 {
	
    public static void talk()
    {
          System.out.println("hello there!");	//method overloading
    }
    
    public static void talk(String name)
    {
          System.out.println("hello"+" "+name);
    }
    
    public static void main(String[] args)
    {
         
         talk("Matthew");
    }


}
