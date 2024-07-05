package basics.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Update {
    public static void main(String[] args) {
        String [] Clgmate = {"Aishwarya","Abinaya","Mohaneshwar","Kavya"};
        System.out.println("Before Updating the Values: ");
        System.out.println(Arrays.toString(Clgmate));

        Scanner bb=new Scanner(System.in);

        System.out.println("What is the position to update in array?");
        int pos=bb.nextInt();
        System.out.println("What is update/replace name: ");
        String name = bb.next();
        Clgmate[pos]=name;

        System.out.println("After updating values");
        System.out.println(Arrays.toString(Clgmate));
    }
}
