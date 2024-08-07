public class Avg {
    public static void main(String[] args) {
        int ages [] = {10,  20 , 30, 40 , 59};
        int length =ages.length;
        float avg, sum=0;
        for ( int age : ages) {
            sum += age;
            }
            avg = sum / length;
            System.out.println(+avg);

    }
}
