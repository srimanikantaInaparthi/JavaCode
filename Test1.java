import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

class Test1{
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String args[]){
    List a1 = new ArrayList();
    a1.add(10);
    List<String> a2 = new LinkedList<String>();
        a2.add("Hello");
        System.out.println(a1);
          System.out.println(a2);
    }
}