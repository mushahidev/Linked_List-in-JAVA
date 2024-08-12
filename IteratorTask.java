package Tasks81224;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTask {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<String>();
        String[] names = {"aa", "bb", "cc"};

        for (int k = 0; k < names.length; k++)
            nameList.add(names[k]);

        Iterator<String> it = nameList.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
