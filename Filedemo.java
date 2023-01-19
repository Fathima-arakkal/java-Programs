import java.io.*;
class Filedemo
{
    public static void main(String args[])
    {
        try{
            Filenewone fnew=new Filenewone("newFilecreated.txt");
            if(fnew.exists())
            {
                System.out.println("File exist");
            }
            else{
                System.out.println("File doesn't Exist");
            }
            
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}