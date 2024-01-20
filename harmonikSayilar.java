import java.util.*;
public class harmonikSayilar {
    public static void main(String[] args) {
        int n ;
        Scanner input = new Scanner(System.in);

        System.out.print("N sayısını giriniz : ");
        n = input.nextInt();

        double result = 0;

        for (double i = 1 ; i<=n ; i++){

        result += (1/i);
        }
        System.out.println(result);
    }
}