public class PrimeNUM{
    public static void main(String args[]){
        int i,n=5,x;
        x=n%2;
        if(x==0||x==1){
                for(i=2;i<=n;){
                    if(n%i==0)
                System.out.println(n+"is not a prime number");
                break;
           }

        }
    }

}