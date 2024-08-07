import java.util.ArrayList;

public class ListLoop {
    public static void main(String[] args) {
        ArrayList<String> Al=new ArrayList<String>();
        Al.add("Apple");
        Al.add("Banana");
        Al.add("Cherry");
        Al.add("Date");
        for(String i :Al){
            System.out.println(i);
        }
    }
}
