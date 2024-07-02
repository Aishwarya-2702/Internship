package basics;

class Industrial_Visit{
    public void Bus()
    {
        int seats=70;
        String timing="10:00PM-6:00AM";
        String place="Kodaikanal";
        System.out.println("Number of Seats Avaliable: "+seats);
        System.out.println("Bus Timing: "+timing);
        System.out.println("Visiting Place: "+place);
    }
}
class tour extends Industrial_Visit{
    public void hotel(){
        int room=2;
        int count=4;
        System.out.println("Required Rooms: "+room);
        System.out.println("Number of person in a room: "+count);
    }
}
class view extends Industrial_Visit{
    public void visit(){
        String First_Place="Guna Cave(Devils Kitchen)";
        String Second_Place="Pine Tree";
        System.out.println("First Place to visit: "+First_Place);
        System.out.println("Second Place to visit: "+Second_Place);
    }
}
public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        view pls=new view();
        pls.Bus();
        pls.visit();
        tour cl=new tour();
        cl.hotel();
    }
}
