import java.io.*;
class meth2
{
    public static void main(String args[])
    {
        try{
            FileOutputStream f1=new FileOutputStream("test.txt");
            boolean fc=f1.createNewFile();
        }
        catch (IOException e)
        {
            System.out.println(e);

        }
    }
}