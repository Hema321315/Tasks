package tasks2;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Collection;
import java.util.List;

public class WorkingwithLists
{
    public static void main(String[] args) 
    {
        ArrayList<String> languages = new ArrayList<String>();
        List<Integer> obj=Arrays.asList(1,2,3,4,5,6);
        ArrayList<Integer> asc=new ArrayList<Integer>(obj);
        ArrayList<Integer> dec=new ArrayList<Integer>(obj);
        languages.add("Java");
        languages.add("C");
        languages.add("C++");
        languages.add("Ruby");
        languages.add("Python");
        languages.remove(1);
        System.out.println(languages);//array list 
        Collections.sort(asc);
        System.out.println(asc);//ascending order
        Collections.sort(dec,Collections.reverseOrder());
        System.out.println(dec);//decending order
        List<String> language = Arrays.asList("Java", "C", "Java", "Python");

        //  LinkedHashSet to be in  order
        Set<String> obj2 = new LinkedHashSet<>(language);

        System.out.println(obj2);//no duplicates

    }
}