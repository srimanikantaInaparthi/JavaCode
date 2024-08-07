import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class TestArr{
    @SuppressWarnings({ "unchecked", "readTypes", "rawtypes" })
    public static void main(String args[]){

    List a1 = new ArrayList();
    a1.add("10");
    a1.add("20");
        List a2 = new LinkedList();
        a2.add(30);
        System.out.println(a1);
          System.out.println(a2);
    }
}