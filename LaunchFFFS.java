import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class LaunchFFFS 
{
    public static void main(String[] args) 
    {
        ArrayList al=new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(100);
        System.out.println(al);

        // for(int i=0; i<al.size(); i++)
        // {
        //     System.out.println(al.get(i));
        //     al.add(100);
        // }

        Iterator itr=al.iterator();

        while (itr.hasNext()) 
        {
            System.out.println(itr.next());
            // al.add(100);
        }

        //Fail Safe

        CopyOnWriteArrayList al1=new CopyOnWriteArrayList<>();

        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        System.out.println(al1);
        
    }
}
