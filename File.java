import java.io.*;
class File
{
    public static void main(String args[])
    {
        try{
            FileOutputStream f=new FileOutputStream("test.txt");
            DataInputStream dis=new DataInputStream(System.in);
            System.out.println("Enter the text..........until it terminate with '@'");
            while(true)
            {
                String dt=dis.readLine();
                if(dt.equals("@"))
                break;
                else
                 f.write(dt.getBytes());
                 f.write(dt.getBytes());
            }
            
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}