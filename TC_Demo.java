public class TC_Demo
{
    public static void main(String[] args)
    {
       int a=0;  int b=5,c=5; int x,y;
       try   
          {
             x=a/(b-c);
           }
       catch(ArithmeticException e)
{
System.out.println("Devide by zero");
}
y=a/(b+c);
System.out.println("y="+y);
}
}
