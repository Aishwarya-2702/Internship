package basics.Arrays;

import java.util.Arrays;

public class Passing_Array {
    public void PassingArray(double[] salary1){
        salary1[3]=1010.13;
        salary1[4]=2727.67;
        System.out.println(Arrays.toString(salary1));
    }
    public void PassingArray2(String name1)
    {
        System.out.println("Hello!!");
    }

    public static void main(String[] args) {
        int a=100;
        String name="Aishwarya Siva Sankar";
        double[] salary={11.1,12,.5,85.6,78.6,63.5};
        Passing_Array pass=new Passing_Array();
        pass.PassingArray(salary);
        pass.PassingArray2(name);
        System.out.println(name);
    }
}
