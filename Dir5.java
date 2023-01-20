import java.io.*;
class Dir5
{
    public static void main(String args[])
    {
        try
        {
            File f = new File("bbbb");
            boolean s = f.mkdirs();
            if(s)
            {
                System.out.println("Directory is created");
            }
            else
            {
                System.out.println("Directory not created");

            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}