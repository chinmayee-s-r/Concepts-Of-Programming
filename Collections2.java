//ArrayList

import java.util.Iterator;
import java.util.LinkedList;

class Collections2{

    public static void main(String[] args) {
        
        ArrayList<String> aobj = new ArrayList<String>();
        
        aobj.add("PPA");
        aobj.add("LB");
        aobj.add("PYTHON");
        aobj.add("ANGULAR");

        for(String str : aobj){
            System.out.println(str);
        }
    }
}