import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("введите какое-нибудь число");
        int x = s.nextInt();                //то что мы введём
        System.out.println("вы ввели "+x);
    }
}