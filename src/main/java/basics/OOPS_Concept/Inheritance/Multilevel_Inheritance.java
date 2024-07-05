package basics.OOPS_Concept.Inheritance;

class college{
    public void Staff()
    {
        int staff_count=24;
        System.out.println("Number of Staffs in College: "+staff_count);
    }
}
class dept extends college{
    public void branch(){
        int dept_count=4;
        String dept_names="CSE,EEE,ECE,AIDS";
        System.out.println("Number of Department Present in our College: "+dept_count);
        System.out.println("Names of the Department: "+dept_names);
    }
}
class students extends dept{
    public void cls(){
        int stud_count=240;
        int dept_stud_count=60;
        System.out.println("Total number of Students in All Department: "+stud_count);
        System.out.println("No of Students in each Department: "+dept_stud_count);
    }
}
public class Multilevel_Inheritance {
    public static void main(String[] args) {
        students clg=new students();
        clg.Staff();
        clg.branch();
        clg.cls();
    }
}
