package basics;

public class Methods
{
    //1.w/o return type and w/o arguments
    public void internclass()
    {
        System.out.println("We are in the process of Learning the course on Java Microservices");
    }
    //2.w/o return type and with arguments
    public void twinklingstars(String name,int dob)
    {
        System.out.println("Star name is: "+name);
        System.out.println("twinkling dob: "+dob);
    }
    //3.with return type and without return type
    public char jdk()
    {
        System.out.println("Java Development Kit(JDK) is the tool to program or access the java programming language\n");
        return 'F';
    }
    public static void main(String[] args)
    {
        Methods intern=new Methods();
        intern.internclass();
        intern.twinklingstars("AbiAishu",2708);
        char gender=intern.jdk();
        System.out.println("current gender is (M-male,F-female)"+gender);
    }
}
