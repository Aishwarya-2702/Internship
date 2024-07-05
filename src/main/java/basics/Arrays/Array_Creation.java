package basics.Arrays;

import java.util.Arrays;

public class Array_Creation {
    public static void main(String[] args) {
        int a=10;
        //array symbol[]
        int[] a1={12,13,14,15,16};//One format of array creation
        int[] a2=new int[15];//Another format of array creation
        System.out.println(a1.length);
        for(int i=0;i<a1.length;i++){ //for loop
            System.out.println(a1[i]);
        }
        for(int abi:a1) //for-each loop
        {
            System.out.println(abi);
        }
        System.out.println(Arrays.toString(a1));
    }
}
