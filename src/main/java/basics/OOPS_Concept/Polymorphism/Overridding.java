package basics.OOPS_Concept.Polymorphism;

public class Overridding {
    public static void main(String[] args) {
        Overriding_2 mm = new Overriding_2();//upcasting
        mm.Statename("Kerala","Tamilnadu");
        Overriding_1 mm1=new Overriding_1();
        mm1.Statename("Kerala","Tamilnadu");

    }
}
