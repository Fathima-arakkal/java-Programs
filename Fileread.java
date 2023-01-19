import java.io.*;
class Fileread
{
    public static void main(String args[])
    {
        try{
            FileInputStream fin=new FileInputStream("E:\\programjava\\123test.txt");
            int i=fin.read();
            char c=(char)i;
            System.out.println(c);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}