//ArrayList

import java.util.Iterator;
import java.util.Stack;

class Collections3{

    public static void main(String[] args) {
        
        Stack<Float> cobj = new Stack<Float>();

        cobj.push(10.5f);
        cobj.push(20.5f);
        cobj.push(30.5f);
        cobj.push(40.5f);

        float fret = cobj.pop();
        System.out.println(fret);

        fret = cobj.pop();
        System.out.println(fret);
    }
}