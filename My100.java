import java.io.*;
class My100
{
   static void checknum(int n)
    {
        if(n==100) 
        {
            throw new Exception("You should not enter 100");
        }
        else
        {
            System.out.println("Number entered is fine");
        }
        
    }
    public static void main(String args[])
    {
        try{
            checknum(23);
        }
        catch(Exeception e)
        {

        }
    }
}