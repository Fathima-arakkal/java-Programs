import java.io.*;
import java.util.*;
class LD
{
    public static void main(String args[])
    {
        LinkedList <String> ll=new LinkedList<String>();
        ll.add("F");
        ll.add("A");
        ll.add("T");
        ll.add("H");
        ll.add("I");
        for(String a:ll)
        {
            System.out.println(a);
        }
        System.out.println("The Size of element is :"+ll.size());
        ll.addFirst(" FATHI :");
        ll.addLast("Good Job!!!!");
        System.out.println("New Word  is :");

        for(String a:ll)
        {
            System.out.println(a);

        }
        Object el=ll.get(3);
        System.out.println("The First Alphabet is  :"+el);

    }
}