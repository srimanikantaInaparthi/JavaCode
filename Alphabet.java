import java.util.Scanner;

public class Alphabet{
    public static void main(String[] args){
        System.out.print("Enter a Alphabet to check whether its is vowel or consonant: ");
        try (Scanner sc = new Scanner(System.in)) {
            char c = sc.next().charAt(0);
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                System.out.println(c+" is a Vowel");
                break;
                default:
                System.out.println(c+" is a Consonant");
            }
        }

    }

}