import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args){
        int x,y,c,sum=0;
        System.out.println("Introduceti numarul: ");
        Scanner cin = new Scanner(System.in);
        x = cin.nextInt();
        while (x != 0) {
            c=x%10;
            x=x/10;
            sum=sum+c;
        }
        System.out.println("Suma cifrelor numerelor este: ",sum);
    }
}
