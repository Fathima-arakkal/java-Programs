import java.io.*;
class meth2
{
    public static void main(String args[])
    {
        try{
            FileOutputStream f1=new FileOutputStream("123test.txt");
            System.out.println("File created");
        }
        catch (IOException e)
        {
            System.out.println(e);

        }
    }
}