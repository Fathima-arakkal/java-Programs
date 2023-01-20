import java.io.*;
class FileDirect

{
    public static void main(String args[])
    {
        try
        {
            File f = new File("test.txt");
            if(f.exists())
            {
                System.out.println("File Exists");
                System.out.println("File name :"+f.getName());
                System.out.println("Parent Name :"+f.parentName());
                System.out.println("Write :"+f.canWrite());
                System.out.println("Read :"+f.canRead());
                System.out.println("File "+f.isFile());
                System.out.println("Path :"+f.getCanonicalpath());
                System.out.println("Length :"+f.length());
            }
            else
            {
                System.out.println("File Doesn't exists");

            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}