package basics;

public class variables {
    String favfood="shaverma"; //global variable
    static int csecount=180; //static variable
    public void sam() //Local variable
    {
        int cosmo=65;
        String name="Aishuabi";
        System.out.println(cosmo);
        System.out.println(name);
        System.out.println(csecount);
    }
    public static void main(String[] args) {
        System.out.println("A2");
        //Local Variable
        //object creation
        //classname objectname=new classname();
        //calling method
        //objectname.methodname
        variables va=new variables();
        va.sam();
        System.out.println(csecount);

        String favperson="LunaRiya"; //instance variable
        System.out.println(favperson);

    }
}
