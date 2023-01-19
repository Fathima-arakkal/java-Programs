import java.io.*;
class meth1
{
    public static void main(String args[])
    {
        try{
            File f1=new File("test.txt");
            boolean fc=f1.createNewFile();
            if(fc)
            {
                 System.out.println("File Created");
            }
            else{
                 System.out.println("File not created");
            }
        }
        catch (IOException e)
        {
            System.out.println(e);

        }
    }
}