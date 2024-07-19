//ArrayList
import java.util.io;
import java.util.Iterator;
import java.util.Hashtable;

class Collections4{

    public static void main(String[] args) {
        
        Hashtable<String, Integer> hobj = new Hashtable<String, Integer>();

        hobj.push("PPA", 19500);
        hobj.push("LB", 20000);
        hobj.push("Python", 20500);
        hobj.push("Angular", 21000);

        System.out.println(hobj.get("Python"));
    }
}