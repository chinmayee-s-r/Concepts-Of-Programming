//LinkedList

import java.util.Iterator;
import java.util.LinkedList;

class Collections1{

    public static void main(String[] args) {
        
        LinkedList<Integer> lobj = new LinkedList<Integer>();
        // LinkedList lobj = new LinkedList<>();

        lobj.add(11);
        lobj.add(22);
        lobj.add(33);
        lobj.add(44);

        System.out.println(lobj);
        lobj.addFirst(55);
        System.out.println(lobj);

        Iterator<> iobj = lobj.iterator();

        while(iobj.hasNext()){
            System.out.println(iobj.next());
        }
        lobj.clear();
    }
}