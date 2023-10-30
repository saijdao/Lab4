package problema1;

import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args){
        int x;
        Scanner cin = new Scanner(System.in);
        System.out.println("Introduceti cuvantul: ");
        String cuvant = cin.nextLine();
        x=cuvant.length()/2;
        if(x%2 != 0){
            System.out.println(cuvant.charAt(x));
        }
        else{
            System.out.println(cuvant.charAt(x-1) + "" + cuvant.charAt(x));
        }
    }
}
