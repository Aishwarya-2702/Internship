package basics;
class travel{
    public void arrival(){
        String Travels_name="ABIAISHU";
        int Travels_Id=1234567;
        System.out.println("Travel's Name: "+Travels_name);
        System.out.println("Travel's code ID: "+Travels_Id);
    }
}
class Bus_Details extends travel{
public void departure(){
    String Timing="4:00AM to 9:00PM";
    String Destination="Salem to Nellore";
    System.out.println("Timing: "+Timing);
    System.out.println("Destination Place: "+Destination);
}
}
public class Single_Inheritance {
    public static void main(String[] args) {
        Bus_Details tr=new Bus_Details();
        tr.arrival();
        tr.departure();
    }
}
