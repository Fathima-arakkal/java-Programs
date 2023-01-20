import java.io.*;
class DirDemo
{
    public static void main(String args[])
    {
        try
        {
            File f = new File("aaa//aa//a");
            boolean s = f.mkdirs();
            if(s)
            {
                System.out.println("Directory Created");
            }
            else{
                System.out.println("Directory not created");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}