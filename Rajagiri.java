import java.io.*;
import java.util.*;
class Rajagiri
{
    public static void main(String args[])
    {
        LinkedList <String> ll=new LinkedList<String>();
        ll.add("Rajagiri College of Social Sciences");
        for(String a:ll)
        {
            System.out.println(a);
        }
        /*System.out.println("The Size of element is :"+ll.size());*/
        ll.addFirst("Hi Everyone !!! Welcome to");
        ll.addLast("Bye Bye!!!!!!!!");
        System.out.println("You entered to :");

        for(String a:ll)
        {
            System.out.println(a);

        }
        /*Object el=ll.get(3);
        System.out.println("Our Symbol is:"+el);*/

    }
}