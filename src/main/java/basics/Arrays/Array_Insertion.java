package basics.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Insertion {
    public static void main(String[] args) {
        int [] arr=new int[5];
        arr[3]=2708;
        arr[4]=4234;
        System.out.println(Arrays.toString(arr));
        Scanner scan= new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter Your Number");
            arr[i]=scan.nextInt();
        }
        for(int aishu:arr){
            System.out.println(aishu);
        }
    }
}
